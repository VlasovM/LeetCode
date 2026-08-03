package ru.javlasov.hashMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.hashMap.GroupAnagrams.groupAnagrams;

class GroupAnagramsTest {

    @Test
    @DisplayName("Example 1: strs = [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]")
    void testExampleFirst() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};


        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of("bat")),
                new ArrayList<>(List.of("nat", "tan")),
                new ArrayList<>(List.of("ate", "eat", "tea"))
        ));


        List<List<String>> actual = groupAnagrams(strs);

        assertEquals(normalize(expected), normalize(actual));
    }

    private List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> group : groups) {
            List<String> sortedGroup = new ArrayList<>(group);
            Collections.sort(sortedGroup);
            result.add(sortedGroup);
        }
        result.sort(Comparator.comparing(list -> list.get(0)));
        return result;
    }

    @Test
    @DisplayName("Example 2: strs = [\"a\"]")
    void testExampleSecond() {
        String[] strs = {"a"};


        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of("a"))
        ));


        List<List<String>> actual = groupAnagrams(strs);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 3: strs = [\"\"]")
    void testExampleThird() {
        String[] strs = {""};


        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(""))
        ));


        List<List<String>> actual = groupAnagrams(strs);

        assertEquals(expected, actual);
    }

}