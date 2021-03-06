/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.matchers;

import java.io.Serializable;

import org.mockito.ArgumentMatcher;

public class StartsWith implements ArgumentMatcher<String>, Serializable {

    private final String prefix;

    public StartsWith(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean matches(String actual) {
        return actual != null && actual.startsWith(prefix);
    }

    @Override
    public String toString() {
        return "startsWith(\"" + prefix + "\")";
    }
}
