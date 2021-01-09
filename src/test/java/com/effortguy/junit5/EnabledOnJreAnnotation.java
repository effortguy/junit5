package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class EnabledOnJreAnnotation {

    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testEnabledOnJreJava8() {
    }

    @Test
    @EnabledOnJre({JRE.JAVA_9, JRE.JAVA_10})
    public void testEnabledOnJreJava9And10() {
    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_8}, disabledReason = "test")
    public void testDisabledOnJreJava8() {
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_8, max =JRE.JAVA_12)
    public void testEnabledForJreRange() {
    }
}