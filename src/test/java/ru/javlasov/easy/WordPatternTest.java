package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.WordPattern.wordPattern;

class WordPatternTest {

    @Test
    @DisplayName("Example 1: pattern = \"abba\", s = \"dog dog dog dog\"")
    void testExampleFirst() {
        String pattern = "abba";
        String s = "dog dog dog dog";

        boolean expected = false;

        boolean actual = wordPattern(pattern, s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: pattern = \"abba\", s = \"dog cat cat fish\"")
    void testExampleSecond() {
        String pattern = "abba";
        String s = "dog cat cat fish";

        boolean expected = false;

        boolean actual = wordPattern(pattern, s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: pattern = \"aaaa\", s = \"dog cat cat dog\"")
    void testExampleThird() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";

        boolean expected = false;

        boolean actual = wordPattern(pattern, s);

        assertEquals(expected, actual);
    }

}