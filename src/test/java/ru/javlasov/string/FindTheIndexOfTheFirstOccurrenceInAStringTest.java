package ru.javlasov.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.string.FindTheIndexOfTheFirstOccurrenceInAString.strStr;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    @DisplayName("Example 1: haystack = \"sadbutsad\", needle = \"sad\"")
    void testExampleFirst() {
        String haystack = "sadbutsad";
        String needle = "sad";

        int expected = 0;
        System.out.println("expected: " + expected);

        int actual = strStr(haystack, needle);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: haystack = \"leetcode\", needle = \"leeto\"")
    void testExampleSecond() {
        String haystack = "leetcode";
        String needle = "leeto";

        int expected = -1;
        System.out.println("expected: " + expected);

        int actual = strStr(haystack, needle);

        assertEquals(expected, actual);
    }

}