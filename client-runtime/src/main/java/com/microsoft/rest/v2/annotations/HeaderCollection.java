/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.rest.v2.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Marker on a deserialized header type that indicates that the property should
 * be treated as a header collection with the provided prefix.
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface HeaderCollection {
    /**
     * The header collection prefix.
     * @return The header collection prefix.
     */
    String value();
}