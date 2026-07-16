package ru.javlasov.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.string.LongestCommonPrefix.longestCommonPrefix;

class LongestCommonPrefixTest {

    @Test
    @DisplayName("Example 1: strs = [\"flower\",\"flow\",\"flight\"]")
    void testExampleFirst() {
        String[] strs = {"flower", "flow", "flight"};

        String expected = "fl";
        System.out.println("expected: " + expected);

        String actual = longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: strs = [\"dog\",\"racecar\",\"car\"]")
    void testExampleSecond() {
        String[] strs = {"dog", "racecar", "car"};

        String expected = "";
        System.out.println("expected: " + expected);

        String actual = longestCommonPrefix(strs);

        assertEquals(expected, actual);
    }

}