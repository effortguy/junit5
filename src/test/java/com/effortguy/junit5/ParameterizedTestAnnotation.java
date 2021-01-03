package com.effortguy.junit5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestAnnotation {

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void testWithValueSource(int intArg) {
        assertTrue(intArg > 0 && intArg < 4);
    }

    // @ValueSource 파라미터로 여러개 값을 넣을 수 없음
    // @ParameterizedTest
    // @ValueSource(ints = { 1, 2, 3 }, strings = {"a", "b", "c"})
    // void testWithValueSource(int intArg, string stringArg) {
    // }

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
