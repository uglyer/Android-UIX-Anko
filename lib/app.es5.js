var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var R;
(function (R) {
    R._res_data = {
        "drawable": {
            "ic_github@3x": "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACoAAAAqCAMAAADyHTlpAAAAgVBMVEUAAAAnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjYnJjZ0hb3iAAAAKnRSTlMA+wT3yapc8q8hXxdZVOzlwrcTv6CWkz0o3M5qBteJckwzC49ENp16MB9dNvtEAAABvElEQVQ4y42UiZKDIAyGoYqIZ9Va22rvc3n/B1yEpNQWuvvPOBOSTzEhgbxrJrq87/NOzMhX1RHjEsRZVHvBFaNyIspWTjBtLWjhNv0kD1w6xQ/v5J5Kj+h+mvZCftHitRg7+VU7S0byD0VIHoNxWXRZHEyJIM66QhtHQEPtb5Ql2JjHuqrWY5ZMKFejg6EhM6m11IvrRczM+V6u2rE00Uw712bRE6d6E12PH0ik0d2N3iGcKLsCm7lRBuGKkBNmfXCjB6zGieRgxsSjGIAcM5Qrb2sCsMSXOPGK47ahMeZ+dC7hFEroHj8KXVeSwGb1Pa+AFP/9gYJs8fM+4S9u8R358JEPifu2YJ196BmA9nlatHOTF/o8rVSCytpF1iXGU5wBpernkxQNRkOYQd7wsXLn2n3h4CQOhSpEPex0mZtdDkM/RMvwZSqLQV8s4zwIbLHF9JBQe3O1bHSTz+JpM65eyQ3sdaR6JIe2oNubvZxetqdH9EaKLU8qqh6rjSUjcAE7f69rOCVRiWKDW5702SdKE/Qgi5W2qCWnyrhJ9R3lGflQylzoIiUudYzKxi4rSdmV+JQmwi5EMv3iL9plctVYHixDAAAAAElFTkSuQmCC"
        },
        "layout": {
            "activity_main": "<framelayout android:layout_height=\"match_parent\" android:layout_width=\"match_parent\">\n    <textview android:id=\"textView\" android:text=\"@string/hello_world\" android:layout_height=\"wrap_content\" android:layout_width=\"wrap_content\" android:layout_gravity=\"center\" android:textSize=\"20sp\"></textview>\n    <textview android:text=\"@string/power_by_androiduix\" android:drawableRight=\"@drawable/ic_github\" android:drawablePadding=\"4dp\" android:layout_gravity=\"center_horizontal|bottom\" android:gravity=\"center\" android:layout_marginBottom=\"8dp\" android:textColor=\"#999\" android:layout_width=\"wrap_content\" android:layout_height=\"wrap_content\" android:textSize=\"12sp\" android:onClick=\"location.href='https://github.com/linfaxin/AndroidUIX'\"></textview>\n</framelayout>"
        },
        "values": {
            "string": {
                "hello_world": "<string name=\"hello_world\">Hello world</string>",
                "power_by_androiduix": "<string name=\"power_by_androiduix\">power by AndroidUIX</string>"
            }
        },
        "values-zh": {
            "string": {
                "power_by_androiduix": "<string name=\"power_by_androiduix\">由AndroidUIX驱动</string>"
            }
        }
    };
})(R || (R = {}));
var R;
(function (R) {
    var Resources = android.content.res.Resources;
    var NetDrawable = androidui.image.NetDrawable;
    var NinePatchDrawable = androidui.image.NinePatchDrawable;
    var NetImage = androidui.image.NetImage;
    R.id = {
        textView: 'textView',
    };
    R.layout = {
        activity_main: '@layout/activity_main',
    };
    R.style = {};
    R.color = {};
    R.array = {};
    R.integer = {};
    R.fraction = {};
    var drawable = (function () {
        function drawable() {
        }
        Object.defineProperty(drawable, "ic_github", {
            get: function () { return Resources.getSystem().getDrawable('ic_github'); },
            enumerable: true,
            configurable: true
        });
        return drawable;
    }());
    R.drawable = drawable;
    var string_ = (function () {
        function string_() {
        }
        Object.defineProperty(string_, "hello_world", {
            get: function () { return Resources.getSystem().getString('hello_world'); },
            enumerable: true,
            configurable: true
        });
        Object.defineProperty(string_, "power_by_androiduix", {
            get: function () { return Resources.getSystem().getString('power_by_androiduix'); },
            enumerable: true,
            configurable: true
        });
        return string_;
    }());
    R.string_ = string_;
    var bool = (function () {
        function bool() {
        }
        return bool;
    }());
    R.bool = bool;
    var res_data = R._res_data;
    function resDirSpecMatch(spec) {
        spec = spec.toLocaleLowerCase();
        var ratio = window.devicePixelRatio;
        if (ratio === 0.75 && spec === 'ldpi')
            return true;
        if (ratio === 1 && spec === 'mdpi')
            return true;
        if (ratio === 1.5 && spec === 'hdpi')
            return true;
        if (ratio === 2 && spec === 'xhdpi')
            return true;
        if (ratio === 3 && spec === 'xxhdpi')
            return true;
        if (ratio === 4 && spec === 'xxxhdpi')
            return true;
        var dpi = ratio * 160;
        if (spec === dpi + 'dpi')
            return true;
        var xdp = document.documentElement.offsetWidth;
        var ydp = document.documentElement.offsetHeight;
        var minDP = Math.min(xdp, ydp);
        var maxDP = Math.max(xdp, ydp);
        if (spec === 'xlarge' && maxDP > 960 && minDP > 720)
            return true;
        if (spec === 'large' && maxDP > 640 && minDP > 480)
            return true;
        if (spec === 'normal' && maxDP > 470 && minDP > 320)
            return true;
        if (spec === 'small' && maxDP > 426 && minDP > 320)
            return true;
        if (spec === 'port' && ydp > xdp)
            return true;
        if (spec === 'land' && xdp > ydp)
            return true;
        if (spec === xdp + 'x' + ydp || spec === ydp + 'x' + xdp)
            return true;
        var swMatch = spec.match(/sw(d*)dp/);
        if (swMatch && parseInt(swMatch[1]) >= minDP)
            return true;
        var wMatch = spec.match(/w(d*)dp/);
        if (wMatch && parseInt(wMatch[1]) >= xdp)
            return true;
        var hMatch = spec.match(/h(d*)dp/);
        if (hMatch && parseInt(hMatch[1]) >= ydp)
            return true;
        var lang = navigator.language.toLocaleLowerCase().split('-')[0];
        if (lang === spec)
            return true;
        if (spec.startsWith('r')) {
            var specArea = spec.substring(1);
            var langArea = navigator.language.toLocaleLowerCase().split('-')[1];
            if (langArea === specArea)
                return true;
        }
    }
    var matchDirNamesCache = {};
    function findMatchDirNames(baseDirName) {
        if (matchDirNamesCache[baseDirName])
            return matchDirNamesCache[baseDirName];
        var matchDirNames = [];
        for (var dirName in res_data) {
            if (dirName == baseDirName || dirName.startsWith(baseDirName + '-')) {
                matchDirNames.push(dirName);
            }
        }
        matchDirNames = matchDirNames.sort(function (a, b) {
            var bSplits = b.split('-');
            bSplits.shift();
            var bMatchTimes = 0;
            for (var _i = 0, bSplits_1 = bSplits; _i < bSplits_1.length; _i++) {
                var split = bSplits_1[_i];
                if (resDirSpecMatch(split))
                    bMatchTimes++;
            }
            var aSplits = a.split('-');
            aSplits.shift();
            var aMatchTimes = 0;
            for (var _a = 0, aSplits_1 = aSplits; _a < aSplits_1.length; _a++) {
                var split = aSplits_1[_a];
                if (resDirSpecMatch(split))
                    aMatchTimes++;
            }
            return bMatchTimes - aMatchTimes;
        });
        matchDirNamesCache[baseDirName] = matchDirNames;
        return matchDirNames;
    }
    var imageFileCache = new Map();
    function findImageFile(fileName) {
        var _loop_1 = function (dirName) {
            var dir = res_data[dirName];
            if (dirName === 'drawable') {
                function findImageWithRatioName(ratio) {
                    var fileNameWithRatio = fileName + '@' + ratio + 'x';
                    var key = dirName + '/' + fileNameWithRatio;
                    var netImage = imageFileCache.get(key);
                    if (!netImage) {
                        var fileStr = dir[fileNameWithRatio];
                        if (fileStr && fileStr.startsWith('data:image')) {
                            netImage = new NetImage(fileStr, ratio);
                            imageFileCache.set(key, netImage);
                        }
                    }
                    if (netImage)
                        return new NetDrawable(netImage);
                    var fileNameWithNinePatch = fileName + '@' + ratio + 'x' + '.9';
                    key = dirName + '/' + fileNameWithNinePatch;
                    netImage = imageFileCache.get(key);
                    if (!netImage) {
                        var fileStr = dir[fileNameWithNinePatch];
                        if (fileStr && fileStr.startsWith('data:image')) {
                            netImage = new NetImage(fileStr, ratio);
                            imageFileCache.set(key, netImage);
                        }
                    }
                    if (netImage)
                        return new NinePatchDrawable(netImage);
                    return null;
                }
                var ratioDrawable = findImageWithRatioName(window.devicePixelRatio);
                if (!ratioDrawable && window.devicePixelRatio !== 3)
                    ratioDrawable = findImageWithRatioName(3);
                if (!ratioDrawable && window.devicePixelRatio !== 2)
                    ratioDrawable = findImageWithRatioName(2);
                if (!ratioDrawable && window.devicePixelRatio !== 4)
                    ratioDrawable = findImageWithRatioName(4);
                if (!ratioDrawable && window.devicePixelRatio !== 1)
                    ratioDrawable = findImageWithRatioName(1);
                if (!ratioDrawable && window.devicePixelRatio !== 5)
                    ratioDrawable = findImageWithRatioName(5);
                if (!ratioDrawable && window.devicePixelRatio !== 6)
                    ratioDrawable = findImageWithRatioName(6);
                return { value: ratioDrawable };
            }
            var ratio = 1;
            if (dirName.includes('-')) {
                if (dirName.includes('-ldpi'))
                    ratio = 0.75;
                else if (dirName.includes('-mdpi'))
                    ratio = 1;
                else if (dirName.includes('-hdpi'))
                    ratio = 1.5;
                else if (dirName.includes('-xhdpi'))
                    ratio = 2;
                else if (dirName.includes('-xxhdpi'))
                    ratio = 3;
                else if (dirName.includes('-xxxhdpi'))
                    ratio = 4;
            }
            var key = dirName + '/' + fileName;
            var netImage = imageFileCache.get(key);
            if (!netImage) {
                var fileStr = dir[fileName];
                if (fileStr && fileStr.startsWith('data:image')) {
                    netImage = new NetImage(fileStr, ratio);
                    imageFileCache.set(key, netImage);
                }
            }
            if (netImage)
                return { value: new NetDrawable(netImage) };
            var fileNameWithNinePatch = fileName + '.9';
            key = dirName + '/' + fileNameWithNinePatch;
            netImage = imageFileCache.get(key);
            if (!netImage) {
                var fileStr = dir[fileNameWithNinePatch];
                if (fileStr && fileStr.startsWith('data:image')) {
                    netImage = new NetImage(fileStr, ratio);
                    imageFileCache.set(key, netImage);
                }
            }
            if (netImage)
                return { value: new NinePatchDrawable(netImage) };
        };
        for (var _i = 0, _a = findMatchDirNames('drawable'); _i < _a.length; _i++) {
            var dirName = _a[_i];
            var state_1 = _loop_1(dirName);
            if (typeof state_1 === "object")
                return state_1.value;
        }
    }
    var _tempDiv = document.createElement('div');
    function findXmlFile(baseDirName, fileName) {
        for (var _i = 0, _a = findMatchDirNames(baseDirName); _i < _a.length; _i++) {
            var dirName = _a[_i];
            var dir = res_data[dirName];
            if (dir[fileName]) {
                _tempDiv.innerHTML = dir[fileName];
                var data = _tempDiv.firstElementChild;
                _tempDiv.removeChild(data);
                return data;
            }
        }
    }
    function findResourcesValue(valueType, valueName) {
        for (var _i = 0, _a = findMatchDirNames('values'); _i < _a.length; _i++) {
            var dirName = _a[_i];
            var dir = res_data[dirName];
            if (dir[valueType] && dir[valueType][valueName]) {
                _tempDiv.innerHTML = dir[valueType][valueName];
                var data = _tempDiv.firstElementChild;
                _tempDiv.removeChild(data);
                return data;
            }
        }
    }
    if ('_AppBuildValueFinder' in android.content.res.Resources) {
        android.content.res.Resources._AppBuildImageFileFinder = function (refString) {
            if (refString.startsWith('@drawable/')) {
                refString = refString.substring('@drawable/'.length);
            }
            return findImageFile(refString);
        };
        android.content.res.Resources._AppBuildXmlFinder = function (refString) {
            if (!refString.startsWith('@')) {
                throw Error('refString must starts with @, current: ' + refString);
            }
            refString = refString.substring(1);
            var splits = refString.split('/');
            if (splits.length != 2)
                throw Error('refString must have one \'/\', current: ' + refString);
            return findXmlFile(splits[0], splits[1]);
        };
        android.content.res.Resources._AppBuildValueFinder = function (refString) {
            if (!refString.startsWith('@')) {
                throw Error('refString must starts with @, current: ' + refString);
            }
            refString = refString.substring(1);
            var splits = refString.split('/');
            if (splits.length != 2)
                throw Error('refString must have one \'/\', current: ' + refString);
            return findResourcesValue(splits[0], splits[1]);
        };
    }
    else {
        throw Error('Error: sdk version is too old. Please update your androidui sdk.');
    }
})(R || (R = {}));
var my;
(function (my) {
    var app;
    (function (app) {
        var ActionBarActivity = android.app.ActionBarActivity;
        var MainActivity = (function (_super) {
            __extends(MainActivity, _super);
            function MainActivity() {
                return _super !== null && _super.apply(this, arguments) || this;
            }
            MainActivity.prototype.onCreate = function (savedInstanceState) {
                _super.prototype.onCreate.call(this, savedInstanceState);
                this.setContentView(R.layout.activity_main);
            };
            return MainActivity;
        }(ActionBarActivity));
        app.MainActivity = MainActivity;
    })(app = my.app || (my.app = {}));
})(my || (my = {}));
//# sourceMappingURL=app.es5.js.map