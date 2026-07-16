package ru.javlasov.string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.string.ReverseWordsInAString.reverseWords;

class ReverseWordsInAStringTest {

    @Test
    @DisplayName("Example 1: s = \"the sky is blue\"")
    void testExampleFirst() {
        String s = "the sky is blue";

        String expected = "blue is sky the";
        System.out.println("expected: " + expected);

        String actual = reverseWords(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"  hello world  \"")
    void testExampleSecond() {
        String s = "  hello world  ";

        String expected = "world hello";
        System.out.println("expected: " + expected);

        String actual = reverseWords(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"a good   example\"")
    void testExampleThird() {
        String s = "a good   example";

        String expected = "example good a";
        System.out.println("expected: " + expected);

        String actual = reverseWords(s);

        assertEquals(expected, actual);
    }

}