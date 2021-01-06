package com.effortguy.junit5.testMethodOrderAnnotation;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodNameTest {

    @ParameterizedTest
    @ValueSource(ints = 1)
    void a_test(Integer s) {
    }

    @ParameterizedTest
    @ValueSource(strings = "1")
    void a_test(String s) {
    }

    @Test
    void b_test() {
    }

    @Test
    void c_test() {
    }
}
