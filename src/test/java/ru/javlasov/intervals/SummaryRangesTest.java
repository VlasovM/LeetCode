package ru.javlasov.intervals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.javlasov.intervals.SummaryRanges.summaryRanges;

class SummaryRangesTest {

    @Test
    @DisplayName("Example 1: nums = [0,1,2,4,5,7]")
    void testExampleFirst() {
        int[] nums = {0, 1, 2, 4, 5, 7};

        List<String> expected = List.of("0->2", "4->5", "7");
        List<String> actual = summaryRanges(nums);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Example 2: nums = [0,2,3,4,6,8,9]")
    void testExampleSecond() {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};

        List<String> expected = List.of("0", "2->4", "6", "8->9");
        List<String> actual = summaryRanges(nums);

        assertEquals(expected, actual);
    }

}