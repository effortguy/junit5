package com.effortguy.junit5.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestText {

    @Test
    void testEqualToIgnoringCase() {
        assertThat("TeSTTEXt", equalToIgnoringCase("testtext"));
    }

    @Test
    void testContainsString() {
        assertThat("text", containsString("e"));
    }

    @Test
    void testEndsWith() {
        assertThat("text", endsWith("xt"));
        assertThat("text", startsWith("te"));
    }
}
