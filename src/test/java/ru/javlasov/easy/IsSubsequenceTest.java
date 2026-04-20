package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.easy.IsSubsequence.isSubsequence;

class IsSubsequenceTest {

    @Test
    @DisplayName("Example 1: s = abc, t = ahbgdc")
    void testExampleFirst() {
        String s = "abc";
        String t = "ahbgdc";

        boolean expected = true;
        System.out.println("expected: " + expected);

        boolean actual = isSubsequence(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = axc, t = ahbgdc")
    void testExampleSecond() {
        String s = "axc";
        String t = "ahbgdc";

        boolean expected = false;
        System.out.println("expected: " + expected);

        boolean actual = isSubsequence(s, t);

        assertEquals(expected, actual);
    }

}