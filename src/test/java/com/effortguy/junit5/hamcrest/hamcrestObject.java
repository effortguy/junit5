package com.effortguy.junit5.hamcrest;

import org.hamcrest.object.IsCompatibleType;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class hamcrestObject {

    @Test
    void testEqualTo() {
        assertThat(new String[] {"foo", "bar"}, equalTo(new String[] {"foo", "bar"}));
    }

    @Test
    void testHasToString() {
        assertThat(true, hasToString("true"));
    }

    @Test
    void testInstanceOf() {
        assertThat("test", instanceOf(String.class));
    }

    @Test
    void testIsCompatibleType() {
        assertThat(Integer.class, IsCompatibleType.typeCompatibleWith(Number.class));
    }

    @Test
    void testNullValue() {
        assertThat(null, nullValue());
    }

    @Test
    void testNotNullValue() {
        assertThat("test", notNullValue());
    }

    @Test
    void testSameInstance() {
        assertThat(new String[] {"foo", "bar"}, sameInstance(new String[] {"foo", "bar"}));
    }
}
