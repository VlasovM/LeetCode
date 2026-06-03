package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.ValidAnagram.isAnagram;

class ValidAnagramTest {

    @Test
    @DisplayName("Example 1: s = \"anagram\", t = \"nagaram\"")
    void testExampleFirst() {
        String s = "anagram";
        String t = "nagaram";

        boolean expected = true;

        boolean actual = isAnagram(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"rat\", t = \"car\"")
    void testExampleSecond() {
        String s = "rat";
        String t = "car";

        boolean expected = false;

        boolean actual = isAnagram(s, t);

        assertEquals(expected, actual);
    }

}