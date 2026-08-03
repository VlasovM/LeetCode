package ru.javlasov.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.string.IntegerToRoman.intToRoman;

class IntegerToRomanTest {

    @Test
    @DisplayName("Example 1: num = 3749")
    void testExampleFirst() {
        int num = 3749;

        String expected = "MMMDCCXLIX";
        System.out.println("expected: " + expected);

        String actual = intToRoman(num);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: num = 58")
    void testExampleSecond() {
        int num = 58;

        String expected = "LVIII";
        System.out.println("expected: " + expected);

        String actual = intToRoman(num);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: num = 1994")
    void testExampleThird() {
        int num = 1994;

        String expected = "MCMXCIV";
        System.out.println("expected: " + expected);

        String actual = intToRoman(num);

        assertEquals(expected, actual);
    }

}