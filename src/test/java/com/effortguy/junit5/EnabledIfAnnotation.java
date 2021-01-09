package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;

public class EnabledIfAnnotation {

    @EnabledIf("customCondition")
    @Test
    void testEnabledIf() {
    }

    @Test
    @DisabledIf("customCondition")
    void testDisabledIf() {
    }

    boolean customCondition() {
        return true;
    }
}
