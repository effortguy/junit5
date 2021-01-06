package com.effortguy.junit5.testMethodOrderAnnotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = MethodOrderer.DisplayName.class)
public class DisplayNameTest {

    @DisplayName("c_test, method : a_test")
    @Test
    void a_test() {
    }

    @DisplayName("a_test, method : b_test")
    @Test
    void b_test() {
    }

    @DisplayName("b_test, method : c_test")
    @Test
    void c_test() {
    }
}
