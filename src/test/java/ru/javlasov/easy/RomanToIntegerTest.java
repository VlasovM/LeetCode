package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.RomanToInteger.romanToInt;

class RomanToIntegerTest {

    @Test
    @DisplayName("Example 1: s = \"III\"")
    void testExampleFirst() {
        String s = "III";

        int expected = 3;
        System.out.println("expected: " + expected);

        int actual = romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"LVIII\"")
    void testExampleSecond() {
        String s = "LVIII";

        int expected = 58;
        System.out.println("expected: " + expected);

        int actual = romanToInt(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"MCMXCIV\"")
    void testExampleThird() {
        String s = "MCMXCIV";

        int expected = 1994;
        System.out.println("expected: " + expected);

        int actual = romanToInt(s);

        assertEquals(expected, actual);
    }

}