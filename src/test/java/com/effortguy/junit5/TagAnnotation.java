package com.effortguy.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagAnnotation {

    @Test
    @Tag("fast")
    void fast_test_1() {
    }

    @Test
    @Tag("fast")
    void fast_test_2() {
    }

    @Test
    @Tag("slow")
    void slow_test_1() {
    }

    @Test
    @Tag("slow")
    void slow_test_2() {
    }
}
