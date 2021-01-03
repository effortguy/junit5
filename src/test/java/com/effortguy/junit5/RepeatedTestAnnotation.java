package com.effortguy.junit5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTestAnnotation {

    // 5번 반복
    @RepeatedTest(5)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
        assertEquals(5, repetitionInfo.getTotalRepetitions());
    }

    //{displayName} = @DisplayName (없으면 기본값)
    //{currentRepetition} = 현재 반복 횟수
    //{totalRepetitions} = 총 반복 횟수
    @RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!")
    void customDisplayName(TestInfo testInfo) {
        assertEquals("Repeat! 1/1", testInfo.getDisplayName());
    }

    //RepeatedTest.LONG_DISPLAY_NAME = DISPLAY_NAME_PLACEHOLDER + " :: " + SHORT_DISPLAY_NAME
    @RepeatedTest(value = 1, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Details...")
    void customDisplayNameWithLongPattern(TestInfo testInfo) {
        assertEquals("Details... :: repetition 1 of 1", testInfo.getDisplayName());
    }
}