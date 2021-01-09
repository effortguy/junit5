package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class EnabledOnOsAnnotation {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testEnabledOnOsWindows() {
    }

    @TestOnWindows
    void testEnabledOnOsWindows2() {
    }

    @Test
    @EnabledOnOs({OS.MAC, OS.LINUX})
    void testEnabledOnOsMacAndLinux() {
    }

    @Test
    @DisabledOnOs(value = {OS.WINDOWS}, disabledReason = "test")
    void testDisabledOnOs() {
    }

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @interface TestOnWindows {
    }
}
