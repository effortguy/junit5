package com.effortguy.junit5.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestLogical {

    @Test
    void testAllOf() {
        assertThat(true, allOf(is(true) , is(true)));
    }

    @Test
    void testAnyOf() {
        assertThat(true, anyOf(is(true) , is(false)));
    }

    @Test
    void testNot() {
        assertThat(true, not(true));
    }
}
