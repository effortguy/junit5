package com.effortguy.junit5;

import com.effortguy.junit5.tag.FastTest;
import com.effortguy.junit5.tag.SlowTest;

public class CustomTagAnnotation {

    @FastTest
    void fast_test_1() {
    }

    @FastTest
    void fast_test_2() {
    }

    @SlowTest
    void slow_test_1() {
    }

    @SlowTest
    void slow_test_2() {
    }
}
