package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.HappyNumber.isHappy;

class HappyNumberTest {

    @Test
    @DisplayName("Example 1: n = 19")
    void testExampleFirst() {
        int n = 19;

        boolean expected = true;
        boolean actual = isHappy(n);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: n = 2")
    void testExampleSecond() {
        int n = 2;

        boolean expected = false;
        boolean actual = isHappy(n);

        assertEquals(expected, actual);
    }

}