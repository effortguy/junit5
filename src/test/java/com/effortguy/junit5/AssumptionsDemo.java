package com.effortguy.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsDemo {

    @Test
    void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getenv("ENV")));
        // remainder of test
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
        // remainder of test
    }

    @Test
    public void testAssumeTrue2() {
        assumeTrue(false);
        // remainder of test
    }

    @Test
    public void testAssumeFalse() {
        assumeFalse(false);
        // remainder of test
    }

    @Test
    public void testAssumingThatTrue() {
        assumingThat(true, () -> {
            //실행 O
            System.out.println("success");
        });
    }

    @Test
    public void testAssumingThatFalse() {
        assumingThat(false, () -> {
            //실행 X
            System.out.println("success");
        });
    }
}
