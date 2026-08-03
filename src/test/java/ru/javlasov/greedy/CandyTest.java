package ru.javlasov.greedy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.greedy.Candy.candy;

class CandyTest {

    @Test
    @DisplayName("Example 1: ratings = [1,0,2]")
    void testExampleFirst() {
        int[] ratings = {1, 0, 2};

        int expected = 5;
        System.out.println("expected: " + expected);

        int actual = candy(ratings);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: ratings = [1,2,2]")
    void testExampleSecond() {
        int[] ratings = {1, 2, 2};

        int expected = 4;
        System.out.println("expected: " + expected);

        int actual = candy(ratings);

        assertEquals(expected, actual);
    }

}