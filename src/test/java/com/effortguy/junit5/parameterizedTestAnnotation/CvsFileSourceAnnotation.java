package com.effortguy.junit5.parameterizedTestAnnotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CvsFileSourceAnnotation {

    @ParameterizedTest
    @CsvFileSource(resources = "/two-column.csv", numLinesToSkip = 1)
    void testCsvFileSourceResource(String country, int reference) {
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/two-column.csv", numLinesToSkip = 1)
    void testCsvFileSourceFiles(String country, int reference) {
    }
}