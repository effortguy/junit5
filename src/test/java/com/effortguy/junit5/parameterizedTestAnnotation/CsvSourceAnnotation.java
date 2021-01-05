package com.effortguy.junit5.parameterizedTestAnnotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CsvSourceAnnotation {

    @ParameterizedTest
    @CsvSource(value = {
        "apple, 1",
        "banana, 2",
        "'lemon, lime', 0xF1"
    })
    void testWithCsvSourceValue(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple: 1"
    }, delimiter = ':')
    void testWithCsvSourceDelimiter(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple: 1"
    }, delimiterString = ":")
    void testWithCsvSourceDelimiterString(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple, ''"
    }, emptyValue = "1")
    void testWithCsvSourceEmptyValue(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "apple, NL"
    }, nullValues = {"NL", "apple"})
    void testWithCsvSourceNullValues(String fruit, Integer rank) {
        assertNull(fruit);
        assertNull(rank);
    }
}
