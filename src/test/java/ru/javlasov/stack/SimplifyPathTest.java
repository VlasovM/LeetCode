package ru.javlasov.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.stack.SimplifyPath.simplifyPath;

class SimplifyPathTest {

    @Test
    @DisplayName("Example 1: path = /home/")
    void testExampleFirst() {
        String path = "/home/";

        String expected = "/home";

        String actual = simplifyPath(path);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: path = /home//foo/")
    void testExampleSecond() {
        String path = "/home//foo/";

        String expected = "/home/foo";

        String actual = simplifyPath(path);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: path = /home/user/Documents/../Pictures")
    void testExampleThird() {
        String path = "/home/user/Documents/../Pictures";

        String expected = "/home/user/Pictures";

        String actual = simplifyPath(path);

        assertEquals(expected, actual);
    }

}