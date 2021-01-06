package com.effortguy.junit5.testMethodOrderAnnotation;

import org.junit.jupiter.api.*;

@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationTest {

    @Order(3)
    @Test
    void a_test() {
    }

    @Order(2)
    @Test
    void b_test() {
    }

    @Order(1)
    @Test
    void c_test() {
    }
}
