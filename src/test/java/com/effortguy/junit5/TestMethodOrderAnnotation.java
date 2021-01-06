package com.effortguy.junit5;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class TestMethodOrderAnnotation {

    @Order(2)
    @DisplayName("c_test")
    @Test
    void a_test() {
    }

    @Order(3)
    @DisplayName("a_test")
    @Test
    void b_test() {
    }

    @Order(1)
    @DisplayName("b_test")
    @Test
    void c_test() {
    }
}
