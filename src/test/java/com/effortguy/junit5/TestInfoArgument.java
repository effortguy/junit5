package com.effortguy.junit5;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class TestInfoArgument {

    @Test
    @Tags({@Tag("fast"), @Tag("user")})
    void repeatedTest(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
    }
}
