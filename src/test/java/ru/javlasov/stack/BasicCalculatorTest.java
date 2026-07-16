package ru.javlasov.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.stack.BasicCalculator.calculate;

class BasicCalculatorTest {

    @Test
    @DisplayName("Example 1: s = \"1 + 1\"")
    void testExampleFirst() {
        String s = "1 + 1";

        int expected = 2;

        int actual = calculate(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"(1+(4+5+2)-3)+(6+8)\"")
    void testExampleSecond() {
        String s = "(1+(4+5+2)-3)+(6+8)";

        int expected = 23;

        int actual = calculate(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \" 2-1 + 2 \"")
    void testExampleThird() {
        String s = "2-1 + 2";

        int expected = 3;

        int actual = calculate(s);

        assertEquals(expected, actual);
    }

}