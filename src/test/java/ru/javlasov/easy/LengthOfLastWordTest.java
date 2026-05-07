package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.LengthOfLastWord.lengthOfLastWord;

class LengthOfLastWordTest {

    @Test
    @DisplayName("Example 1: s = \"Hello World\"")
    void testExampleFirst() {
        String s = "Hello World";

        int expected = 5;
        System.out.println("expected: " + expected);

        int actual = lengthOfLastWord(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"luffy is still joyboy\"")
    void testExampleSecond() {
        String s = "luffy is still joyboy";

        int expected = 6;
        System.out.println("expected: " + expected);

        int actual = lengthOfLastWord(s);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"   fly me   to   the moon  \"")
    void testExampleThird() {
        String s = "   fly me   to   the moon  ";

        int expected = 4;
        System.out.println("expected: " + expected);

        int actual = lengthOfLastWord(s);

        assertEquals(expected, actual);
    }

}