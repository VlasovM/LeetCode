package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.ValidPalindrome.isPalindrome;

class ValidPalindromeTest {

    @Test
    @DisplayName("Example 1: A man, a plan, a canal: Panama")
    void testExampleFirst() {
        String input = "A man, a plan, a canal: Panama";

        boolean expected = true;
        System.out.println("expected: " + expected);

        boolean actual = isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: race a car")
    void testExampleSecond() {
        String input = "race a car";

        boolean expected = false;
        System.out.println("expected: " + expected);

        boolean actual = isPalindrome(input);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: \" \"")
    void testExampleThird() {
        String input = " ";

        boolean expected = true;
        System.out.println("expected: " + expected);

        boolean actual = isPalindrome(input);

        assertEquals(expected, actual);
    }

}