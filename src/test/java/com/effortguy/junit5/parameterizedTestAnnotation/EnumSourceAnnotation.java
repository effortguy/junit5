package com.effortguy.junit5.parameterizedTestAnnotation;

import com.effortguy.junit5.enumsource.Day;
import com.effortguy.junit5.enumsource.Month;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.params.provider.EnumSource.Mode.*;
import static org.junit.jupiter.params.provider.EnumSource.Mode.MATCH_ALL;

public class EnumSourceAnnotation {

    @ParameterizedTest
    @EnumSource(value = Month.class)
    void testEnumSourceValue(Month month) {
    }

    //value 생략 시 메소드 인자 값 정보를 읽어서 주입
    @ParameterizedTest
    @EnumSource
    void testEnumSourceValue2(String month) {
    }

    @ParameterizedTest
    @EnumSource(mode = INCLUDE, names = {"May"})
    void testEnumSourceInclude(Month month) {
    }

    @ParameterizedTest
    @EnumSource(mode = EXCLUDE, names = {"May", "March"})
    void testEnumSourceExclude(Month month) {
    }

    @ParameterizedTest
    @EnumSource(mode = MATCH_ANY, names = {"^.*sday$","^.*esday$"})
    void testEnumSourceMatchAny(Day day) {
    }

    @ParameterizedTest
    @EnumSource(mode = MATCH_ALL, names = {"^.*sday$","^.*esday$"})
    void testEnumSourceMatchAll(Day day) {
    }
}
