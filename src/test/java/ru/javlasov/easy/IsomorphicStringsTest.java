package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.easy.IsomorphicStrings.isIsomorphic;

class IsomorphicStringsTest {

    @Test
    @DisplayName("Example 1: s = \"egg\", t = \"add\"")
    void testExampleFirst() {
        String s = "egg";
        String t = "add";

        boolean expected = true;

        boolean actual = isIsomorphic(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"f11\", t = \"b23\"")
    void testExampleSecond() {
        String s = "f11";
        String t = "b23";

        boolean expected = false;

        boolean actual = isIsomorphic(s, t);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"paper\", t = \"title\"")
    void testExampleThird() {
        String s = "paper";
        String t = "title";

        boolean expected = true;

        boolean actual = isIsomorphic(s, t);

        assertEquals(expected, actual);
    }

}