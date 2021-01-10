package com.effortguy.junit5.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestNumber {

    @Test
    void testCloseTo() {
        assertThat(10.5, closeTo(10, 1));
    }

    @Test
    void testGreaterThan() {
        assertThat(10, greaterThan(5));
        assertThat(10, greaterThanOrEqualTo(10));
        assertThat(10, lessThan(11));
        assertThat(10, lessThanOrEqualTo(10));
    }
}
