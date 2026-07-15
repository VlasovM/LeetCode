package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.string.ZigzagConversion.convert;

class ZigzagConversionTest {

    @Test
    @DisplayName("Example 1: s = \"PAYPALISHIRING\", numRows = 3")
    void testExampleFirst() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String expected = "PAHNAPLSIIGYIR";
        System.out.println("expected: " + expected);

        String actual = convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"PAYPALISHIRING\", numRows = 4")
    void testExampleSecond() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        String expected = "PINALSIGYAHRPI";
        System.out.println("expected: " + expected);

        String actual = convert(s, numRows);

        assertEquals(expected, actual);
    }

}