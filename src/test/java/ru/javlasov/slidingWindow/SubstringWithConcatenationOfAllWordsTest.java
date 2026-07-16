package ru.javlasov.slidingWindow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.slidingWindow.SubstringWithConcatenationOfAllWords.findSubstring;

class SubstringWithConcatenationOfAllWordsTest {

    @Test
    @DisplayName("Example 1: s = \"barfoothefoobarman\", words = [\"foo\",\"bar\"]")
    void testExampleFirst() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        List<Integer> expected = List.of(0, 9);
        System.out.println("expected: " + expected);

        List<Integer> actual = findSubstring(s, words);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: s = \"wordgoodgoodgoodbestword\", words = [\"word\",\"good\",\"best\",\"word\"]")
    void testExampleSecond() {
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};

        List<Integer> expected = new ArrayList<>();
        System.out.println("expected: " + expected);

        List<Integer> actual = findSubstring(s, words);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: s = \"barfoofoobarthefoobarman\", words = [\"bar\",\"foo\",\"the\"]")
    void testExampleThird() {
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};

        List<Integer> expected = List.of(6, 9, 12);
        System.out.println("expected: " + expected);

        List<Integer> actual = findSubstring(s, words);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 4: s = \"barfoofoobartheamthebarfoo\", words = [\"bar\",\"foo\",\"the\"]")
    void testExampleFourth() {
        String s = "barfoofoobartheamthebarfoo";
        String[] words = {"bar", "foo", "the"};

        List<Integer> expected = List.of(6, 17);
        System.out.println("expected: " + expected);

        List<Integer> actual = findSubstring(s, words);

        assertEquals(expected, actual);
    }

}