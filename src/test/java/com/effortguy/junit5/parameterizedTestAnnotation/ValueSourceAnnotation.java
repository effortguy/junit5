package com.effortguy.junit5.parameterizedTestAnnotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceAnnotation {

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
}
