package com.effortguy.junit5.parameterizedTestAnnotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullEmptySourceAnnotation {

    @ParameterizedTest
    @NullSource
    void testWithNullSource(Integer integerArg) {
        assertTrue(integerArg == null);
    }

    // primitive type에는 @NullSource 사용 불가
    // @ParameterizedTest
    // @NullSource
    // void testWithNullSource(int intArg) {
    // }

    @ParameterizedTest
    @EmptySource
    void testWithEmptySource(Map map) {
        assertTrue(map.isEmpty());
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = { " ", "   ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }
}
