package com.effortguy.junit5;

import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.IndicativeSentencesGeneration;
import org.junit.jupiter.api.Test;

@IndicativeSentencesGeneration(separator = " -> ", generator = DisplayNameGenerator.ReplaceUnderscores.class)
public class IndicativeSentencesGenerationAnnotation {

    @Test
    void test_display_name_generation() {
    }
}
