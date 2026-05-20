package ru.javlasov.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.hard.TextJustification.fullJustify;

class TextJustificationTest {

    @Test
    @DisplayName("Example 1: words = [\"This\", \"is\", \"an\", \"example\", \"of\", \"text\", \"justification.\"], c = 16")
    void testExampleFirst() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        List<String> expected = List.of("This    is    an", "example  of text", "justification.  ");
        System.out.println("expected: " + expected);

        List<String> actual = fullJustify(words, maxWidth);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: words = [\"What\",\"must\",\"be\",\"acknowledgment\",\"shall\",\"be\"], maxWidth = 16")
    void testExampleSecond() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;

        List<String> expected = List.of("What   must   be", "acknowledgment  ", "shall be        ");
        System.out.println("expected: " + expected);

        List<String> actual = fullJustify(words, maxWidth);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: words = [\"Science\",\"is\",\"what\",\"we\",\"understand\",\"well\",\"enough\",\"to\"," +
            "\"explain\",\"to\",\"a\",\"computer.\",\"Art\",\"is\",\"everything\",\"else\",\"we\",\"do\"], maxWidth = 20")
    void testExampleThird() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
                "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;

        List<String> expected = List.of("Science  is  what we", "understand      well", "enough to explain to",
                "a  computer.  Art is", "everything  else  we", "do                  ");
        System.out.println("expected: " + expected);

        List<String> actual = fullJustify(words, maxWidth);

        assertEquals(expected, actual);
    }


}