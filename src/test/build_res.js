"use strict";

var SDKReferencePath = "../androidui-sdk/android-ui.d.ts";

var fs = require('fs');
var jsdom = require('jsdom');
var xmlreader = require("xmlreader");
var parseString = require('xml2js').parseString;


const definedIds = new Set();
const definedDrawables = new Set();
const definedLayouts = new Set();
const definedColors = new Set();
const definedArrays = new Set();
const definedStrings = new Set();
const definedBools = new Set();
const definedInts = new Set();
const definedDimens = new Set();
const definedFractions = new Set();
const definedStyles = new Set();

buildResource();

function buildResource() {
    const resPath = 'res';
    if (!fs.existsSync(resPath)) return;
    //if (!fs.existsSync('gen')) fs.mkdirSync('gen');

    const resData = {};
    var objR = "";

    fs.readdirSync(resPath).forEach(function (resSubDirName) {
        if (resSubDirName.indexOf('.') === 0) return;
        //const packedDir = packDir(resPath + '/' + resSubDirName);
        const packedDir = packDir(resPath + '/' + resSubDirName);
        if (packedDir) {
            if (resSubDirName == "values") {
                for (var item in packedDir) {
                    resData[item] = packedDir[item];
                    objR += parserObj(item, packedDir[item]);
                }
            } else {
                resData[resSubDirName] = packedDir;
                objR += parserObj(resSubDirName, packedDir);
            }

        }
    });

    const resDataStr = `
class R {
    val _res_data = ${JSON.stringify(resData, null, 8)};
}
`;
//     var color = "";
//
    const resRClazz = `import android.graphics.drawable.Drawable
import UKot.getDrawable
import UKot.interfaces.AppColor
    
object R {
    ${objR}
}`;
    //fs.writeFile('src/res_data.kt', resDataStr, 'utf-8');
    fs.writeFile('src/R.kt', resRClazz, 'utf-8');
}

function append(str) {
    return str.replace(/\n/g, "\\n").replace(/"/g, "\\\"")
}

function parserObj(key, data) {
    var obj = "";
    var i = 0;
    for (var item in data) {
        if (key == "color" || key == "string") {
            i++;
            parserColor(key, data[item], function (txt) {
                if (item == "colorPrimary" || item == "colorPrimaryDark" || item == "colorAccent") {
                    obj += `override val ${item} = \"${append(txt)}\"\n        `;
                } else {
                    obj += `val ${item} = \"${append(txt)}\"\n        `;
                }

                i--;
            });
        } else if (key == "layout2") {
            i++;
            parser2Json(data[item], function (js) {
                obj += `val ${item} = \"${JSON.stringify(js, null, 8)}\"`;
                i--;
            });
        } else {
            if (item.indexOf(":") > 0) {
                obj += `val ${item} 
                get() = ${append(data[item])}
        `;
            } else {
                obj += `private val ${item} = "${append(data[item])}"
        `;
            }

        }

        if (key == "layout") {
            var view = "";
            var dataBinding = `package DataBinding
            
import app.content.Context
import app.view.DataBinding

class ${item}_data_binding  constructor(override var context: Context?) : DataBinding(context) {
    ${view}
}
`;
            fs.writeFile('src/DataBinding/' + item + '_data_binding.kt', dataBinding, 'utf-8');
        }

    }
    while (i > 0) {
        continue
    }
    if(key=="color"){
        return `
    object ${key} : AppColor{
        ${obj}
    }
    `;
    }else {
        return `
    object ${key}{
        ${obj}
    }
    `;
    }
}

function parser2Json(xml, callback) {
    parseString(xml, function (err, result) {
        console.dir(result);
        callback(result);
    });
}

function parserColor(key, xml, callback) {

    xmlreader.read(xml, function (errors, response) {
        //console.log(response);
        callback(`${response[key].text()}`);
    })
}

function packDir(resSubDirPath) {
    const dirPack = {};
    if (resSubDirPath === 'res/drawable' || resSubDirPath.indexOf('res/drawable-') === 0) {//drawable
        traverseFile(resSubDirPath, function (filePath) {
            const fileName = filePath.split('/').pop();
            const splits = fileName.split('.');
            if (splits.length <= 1) return;
            const fileSuffixes = splits[splits.length - 1];
            const fileNameNoSuf = fileName.substring(0, fileName.length - 1 - fileSuffixes.length);

            switch (fileSuffixes) {
                case 'png':
                case 'jpg':
                case 'gif':
                case 'webp':
                    let imageFilePureName = fileNameNoSuf;
                    if (imageFilePureName.endsWith('.9')) {
                        imageFilePureName = imageFilePureName.substring(0, imageFilePureName.length - 2);
                    }
                    if (imageFilePureName.endsWith('@1x') || imageFilePureName.endsWith('@2x') || imageFilePureName.endsWith('@3x')
                        || imageFilePureName.endsWith('@4x') || imageFilePureName.endsWith('@5x') || imageFilePureName.endsWith('@6x')) {
                        imageFilePureName = imageFilePureName.substring(0, imageFilePureName.length - 3);
                    }
                    definedDrawables.add(imageFilePureName);
                    const base64Data = fs.readFileSync(filePath, 'base64');
                    dirPack["_" + fileNameNoSuf] = `data:image/${fileSuffixes};base64,${base64Data}`;
                    dirPack["" + fileNameNoSuf + ":Drawable"] = "getDrawable(_" + fileNameNoSuf + ")";
                    break;

                case 'xml':
                    const document = readXmlFile(filePath);
                    definedDrawables.add(fileNameNoSuf);
                    dirPack[fileNameNoSuf] = document.documentElement.outerHTML;
                    break;
                default:
                    console.warn('Not support file in res dir. skip :' + filePath);
            }
        });

    } else if (resSubDirPath === 'res/layout' || resSubDirPath.indexOf('res/layout-') === 0) {//layout
        traverseFile(resSubDirPath, function (filePath) {
            const fileName = filePath.split('/').pop();
            const splits = fileName.split('.');
            if (splits.length <= 1) return;
            const fileSuffixes = splits[splits.length - 1];
            const fileNameNoSuf = fileName.substring(0, fileName.length - 1 - fileSuffixes.length);
            if (fileSuffixes == 'xml') {
                const document = readXmlFile(filePath);
                parseLayoutDoc(document.documentElement);
                definedLayouts.add(fileNameNoSuf);
                dirPack[fileNameNoSuf] = document.documentElement.outerHTML;
            } else if (fileSuffixes == 'html') {
                const document = readHtmlFile(filePath);
                var rootNode = document.body.firstElementChild;
                parseLayoutDoc(rootNode);
                definedLayouts.add(fileNameNoSuf);
                dirPack[fileNameNoSuf] = rootNode.outerHTML;
            } else {
                console.warn('Not support file in res dir. skip :' + filePath);
            }
        });

    } else if (resSubDirPath === 'res/color' || resSubDirPath.indexOf('res/color-') === 0) {//color
        traverseFile(resSubDirPath, function (filePath) {
            const fileName = filePath.split('/').pop();
            const splits = fileName.split('.');
            if (splits.length <= 1) return;
            const fileSuffixes = splits[splits.length - 1];
            const fileNameNoSuf = fileName.substring(0, fileName.length - 1 - fileSuffixes.length);
            if (fileSuffixes == 'xml') {
                const document = readXmlFile(filePath);
                definedColors.add(fileNameNoSuf);
                dirPack[fileNameNoSuf] = document.documentElement.outerHTML;
            } else {
                console.warn('Not support file in res dir. skip :' + filePath);
            }
        });

    } else if (resSubDirPath === 'res/values' || resSubDirPath.indexOf('res/values-') === 0) {//color
        traverseFile(resSubDirPath, function (filePath) {
            const fileName = filePath.split('/').pop();
            const splits = fileName.split('.');
            if (splits.length <= 1) return;
            const fileSuffixes = splits[splits.length - 1];
            if (fileSuffixes == 'xml') {
                const document = readXmlFile(filePath);
                readResourcesXmlToPack(document.documentElement, filePath, dirPack);
            } else if (fileSuffixes == 'html') {
                console.warn('No longer support html file to defined resource. skip :' + filePath);
            } else {
                console.warn('Not support file in res dir. skip :' + filePath);
            }
        });

    } else {
        console.error('Resources file can only put in res/drawable, res/layout, res/color or res/values : ' + resSubDirPath);
        return;
    }
    return dirPack;

}

function readXmlFile(filePath) {
    let xml = fs.readFileSync(filePath, 'utf-8');
    xml = xml.replace(new RegExp("\\\\n", "g"), "\n");
    xml = xml.replace(new RegExp("\\\\r", "g"), "\r");
    xml = xml.replace(new RegExp("\\\\t", "g"), "\t");
    const doc = jsdom.jsdom(xml, {parsingMode: 'xml'});
    return doc.defaultView.document;
}
function readHtmlFile(filePath) {
    let html = fs.readFileSync(filePath, 'utf-8');
    html = html.replace(new RegExp("\\\\n", "g"), "\n");
    html = html.replace(new RegExp("\\\\r", "g"), "\r");
    html = html.replace(new RegExp("\\\\t", "g"), "\t");
    const doc = jsdom.jsdom(html, {parsingMode: 'html'});
    return doc.defaultView.document;
}

function readResourcesXmlToPack(doc, filePath, resPack) {
    if (doc.tagName.toLowerCase() == 'resources') {
        for (let child of Array.from(doc.children)) {
            let resType = child.tagName.toLowerCase();
            if (resType == 'item') {
                resType = child.getAttribute('type');
            }
            let resName = child.getAttribute('name');
            if (!resName) {
                console.error('Resources need attribute \'name\', file:' + filePath + ', xml:' + child.outerHTML);
                return;
            }
            switch (resType) {
                case 'id':
                    definedIds.add(resName);
                    continue;
                case 'color':
                    definedColors.add(resName);
                    break;
                case 'drawable':
                    definedDrawables.add(resName);
                    break;
                case 'array':
                case 'string-array':
                case 'integer-array':
                    resType = 'array';
                    definedArrays.add(resName);
                    break;
                case 'string':
                    definedStrings.add(resName);
                    break;
                case 'bool':
                    definedBools.add(resName);
                    break;
                case 'integer':
                    definedInts.add(resName);
                    break;
                case 'dimen':
                    definedDimens.add(resName);
                    break;
                case 'fraction':
                    definedFractions.add(resName);
                    break;
                case 'style':
                    definedStyles.add(resName);
                    break;
                default:
                    console.error('Not support resources type:' + resType + ', xml: ' + child.outerHTML);
                    return;
            }
            resPack[resType] = resPack[resType] || {};

            resPack[resType][resName] = child.outerHTML
                .replace(new RegExp("<style", "g"), "<android-style")
                .replace(new RegExp("</style>", "g"), "</android-style>");
        }
        return resPack;

    } else {
        console.error('Resources xml file\'s root tag must be \'resources\'. file:' + filePath);
    }
}

function parseLayoutDoc(doc) {
    travelElement(doc);
    function travelElement(ele) {
        if (ele) {
            //id="@+id/xx" ==> android:id="xx",
            let id = ele.getAttribute('android:id') || ele.getAttribute('id');
            ele.removeAttribute('id');
            if (id) {
                if (id.startsWith('@+id/')) id = id.substring('@+id/'.length);
                if (id.startsWith('@id/')) id = id.substring('@id/'.length);
                ele.setAttribute('android:id', id);
                definedIds.add(id);
            }

            //@+id/xx => xx
            for (let attr of Array.from(ele.attributes)) {
                if (attr.value.startsWith('@+id/')) {
                    ele.setAttribute(attr.name, attr.value.substring('@+id/'));
                } else if (attr.value.startsWith('@id/')) {
                    ele.setAttribute(attr.name, attr.value.substring('@id/'));
                }
            }

            //remove xmlns & xmlns:android, no need when run
            ele.removeAttribute('xmlns');
            ele.removeAttribute('xmlns:android');

            for (var child of Array.from(ele.children)) {
                travelElement(child);
            }
        }
    }
}


function traverseFile(path, callback) {
    if (path.indexOf('.') === 0) return;
    if (fs.statSync(path).isDirectory()) {
        const dirs = fs.readdirSync(path);
        dirs.forEach(function (fileName) {
            const dirPath = path + '/' + fileName;
            traverseFile(dirPath, callback);
        });

    } else {
        callback(path);
    }
}