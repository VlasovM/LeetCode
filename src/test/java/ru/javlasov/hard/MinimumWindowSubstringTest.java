package ru.javlasov.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.slidingWindow.MinimumWindowSubstring.minWindow;

class MinimumWindowSubstringTest {

    @Test
    @DisplayName("Example 1: s = \"ADOBECODEBANC\", t = \"ABC\"")
    void testExampleFirst() {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String expected = "BANC";
        System.out.println("expected: " + expected);

        String actual = minWindow(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"a\", t = \"a\"")
    void testExampleSecond() {
        String s = "a";
        String t = "a";

        String expected = "a";
        System.out.println("expected: " + expected);

        String actual = minWindow(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"a\", t = \"aa\"")
    void testExampleThird() {
        String s = "a";
        String t = "aa";

        String expected = "";
        System.out.println("expected: " + expected);

        String actual = minWindow(s, t);

        assertEquals(expected, actual);
    }

}