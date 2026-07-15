package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.slidingWindow.LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;

class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    @DisplayName("Example 1: s = \"abcabcbb\"")
    void testExampleFirst() {
        String s = "abcabcbb";

        int expected = 3;
        System.out.println("expected: " + expected);

        int actual = lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"bbbbb\"")
    void testExampleSecond() {
        String s = "bbbbb";

        int expected = 1;
        System.out.println("expected: " + expected);

        int actual = lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"pwwkew\"")
    void testExampleThird() {
        String s = "pwwkew";

        int expected = 3;
        System.out.println("expected: " + expected);

        int actual = lengthOfLongestSubstring(s);

        assertEquals(expected, actual);
    }

}