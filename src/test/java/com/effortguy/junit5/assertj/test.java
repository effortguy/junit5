package com.effortguy.junit5.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class test {

    @Test
    void testAssertThatIsEqualTo() {
        assertThat("test").isEqualTo("test");
    }
}
