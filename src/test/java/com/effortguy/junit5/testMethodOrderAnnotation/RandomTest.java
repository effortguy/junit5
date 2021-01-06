package com.effortguy.junit5.testMethodOrderAnnotation;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class RandomTest {

    @Test
    void a_test() {
    }

    @Test
    void b_test() {
    }

    @Test
    void c_test() {
    }
}
