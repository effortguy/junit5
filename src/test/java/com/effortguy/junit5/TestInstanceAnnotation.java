package com.effortguy.junit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(value = PER_CLASS)
public class TestInstanceAnnotation {

    public int i=0;

    @Test
    void test_1() {
        assertTrue(++i == 1);
    }

    @Test
    void test_2() {
        assertTrue(++i == 1);
    }
}