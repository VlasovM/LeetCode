package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.stack.ValidParentheses.isValid;

class ValidParenthesesTest {

    @Test
    @DisplayName("Example 1:  s = \"()\"")
    void testExampleFirst() {
        String s = "()";

        boolean expected = true;

        boolean actual = isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2:  s = \"()[]{}\"")
    void testExampleSecond() {
        String s = "()[]{}";

        boolean expected = true;

        boolean actual = isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3:  s = \"(]\"")
    void testExampleThird() {
        String s = "(]";

        boolean expected = false;

        boolean actual = isValid(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4:  s = \"([])\"")
    void testExampleFourth() {
        String s = "([])";

        boolean expected = true;

        boolean actual = isValid(s);

        assertEquals(expected, actual);
    }

}