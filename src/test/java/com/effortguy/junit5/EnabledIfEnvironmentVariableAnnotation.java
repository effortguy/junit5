package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnabledIfEnvironmentVariableAnnotation {

    @Test
    @EnabledIfEnvironmentVariable(named = "JUnit", matches = "5")
    void testEnabledIfEnvironmentVariable() {
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "JUnit", matches = "5")
    void testDisabledIfEnvironmentVariable() {
    }
}
