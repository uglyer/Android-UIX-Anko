/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.support.annotation

import java.lang.annotation.ElementType.ANNOTATION_TYPE
import java.lang.annotation.ElementType.CONSTRUCTOR
import java.lang.annotation.ElementType.FIELD
import java.lang.annotation.ElementType.METHOD
import java.lang.annotation.ElementType.PACKAGE
import java.lang.annotation.ElementType.TYPE
import java.lang.annotation.RetentionPolicy.CLASS

import java.lang.annotation.Retention
import java.lang.annotation.Target
//import com.sun.deploy.security.ValidationState.TYPE


/**
 * Denotes that the annotated element should only be accessed from within a
 * specific scope (as defined by [Scope]).
 *
 *
 * Example of restricting usage within a library (based on gradle group ID):
 * <pre>`
 * &#64;RestrictTo(GROUP_ID)
 * public void resetPaddingToInitialValues() { ...
`</pre> *
 * Example of restricting usage to tests:
 * <pre>`
 * &#64;RestrictScope(TESTS)
 * public abstract int getUserId();
`</pre> *
 * Example of restricting usage to subclasses:
 * <pre>`
 * &#64;RestrictScope(SUBCLASSES)
 * public void onDrawForeground(Canvas canvas) { ...
`</pre> *
 */

@Retention(CLASS)
@Target(ANNOTATION_TYPE, TYPE, METHOD, CONSTRUCTOR, FIELD, PACKAGE)
interface RestrictTo {

    /**
     * The scope to which usage should be restricted.
     */
    val value: Scope


}