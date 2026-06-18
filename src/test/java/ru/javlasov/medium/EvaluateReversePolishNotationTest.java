package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.medium.EvaluateReversePolishNotation.evalRPN;

class EvaluateReversePolishNotationTest {

    @Test
    @DisplayName("Example 1: tokens = [\"2\",\"1\",\"+\",\"3\",\"*\"]")
    void testExampleFirst() {
        String[] tokens = {"2", "1", "+", "3", "*"};

        int expected = 9;

        int actual = evalRPN(tokens);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: tokens = [\"4\",\"13\",\"5\",\"/\",\"+\"]")
    void testExampleSecond() {
        String[] tokens = {"4", "13", "5", "/", "+"};

        int expected = 6;

        int actual = evalRPN(tokens);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: tokens = [\"10\",\"6\",\"9\",\"3\",\"+\",\"-11\",\"*\",\"/\",\"*\",\"17\",\"+\",\"5\",\"+\"]")
    void testExampleThird() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        int expected = 22;

        int actual = evalRPN(tokens);

        assertEquals(expected, actual);
    }

}