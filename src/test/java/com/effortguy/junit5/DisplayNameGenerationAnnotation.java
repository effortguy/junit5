package com.effortguy.junit5;

import org.junit.jupiter.api.*;

public class DisplayNameGenerationAnnotation {

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
    class DNGAIndicativeSentences {

        @Test
        void test_display_name_generation() {
        }
    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
    class DNGAReplaceUnderscores {

        @Test
        void test_display_name_generation() {
        }
    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.Simple.class)
    class DNGASimple {

        @Test
        void test_display_name_generation() {
        }
    }

    @Nested
    @DisplayNameGeneration(DisplayNameGenerator.Standard.class)
    class DNGAStandard {

        @Test
        void test_display_name_generation() {
        }
    }
}
