package com.effortguy.junit5;

import org.junit.jupiter.api.*;

public class BasicAnnotation {

    @BeforeAll
    static void beforeAll() {
        System.out.println("-- @BeforeAll");
        System.out.println();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("-- @AfterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("--- @BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("--- @AfterEach");
        System.out.println();
    }

    @Test
    void test1() {
        System.out.println("---- @Test test1");
    }

    @Test
    void test2() {
        System.out.println("---- @Test test2");
    }

    @Test
    @Disabled
    void disabled_test() {
        System.out.println("---- @Test disabled_test");
    }
}
