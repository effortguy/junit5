package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class EnabledIfSystemPropertyAnnotation {

    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "1.8.0_261")
    void testEnabledIfSystemProperty() {
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.version", matches = "1.8.0_261"),
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testEnabledIfSystemProperties() {
    }

    @Test
    @DisabledIfSystemProperty(named = "java.version", matches = "1.8.0_261")
    void testDisabledIfSystemProperty() {
    }
}
