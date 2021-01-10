package com.effortguy.junit5.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestCore {

    @Test
    void testAnything() {
        assertThat("test", anything());
    }

    @Test
    void testDescribedAs () {
        assertThat("test", describedAs("for 0%", is("test"), "test"));
    }

    @Test
    void testIs() {
        assertThat("test", is("test"));
    }
}
