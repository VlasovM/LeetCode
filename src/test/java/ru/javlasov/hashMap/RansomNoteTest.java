package ru.javlasov.hashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.hashMap.RansomNote.canConstruct;

class RansomNoteTest {

    @Test
    @DisplayName("Example 1: ransomNote = \"a\", magazine = \"b\"")
    void testExampleFirst() {
        String ransomNote = "a";
        String magazine = "b";

        boolean expected = false;

        boolean actual = canConstruct(ransomNote, magazine);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 1: ransomNote = \"aa\", magazine = \"ab\"")
    void testExampleSecond() {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean expected = false;

        boolean actual = canConstruct(ransomNote, magazine);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 1: ransomNote = \"aa\", magazine = \"aab\"")
    void testExampleThird() {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean expected = true;

        boolean actual = canConstruct(ransomNote, magazine);

        assertEquals(expected, actual);
    }

}