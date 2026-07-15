package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static ru.javlasov.linkedList.MergeTwoSortedLists.mergeTwoLists;

class MergeTwoSortedListsTest {

    private int[] listToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.getVal());
            head = head.getNext();
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    @DisplayName("Example 1: list1 = [1,2,4], list2 = [1,3,4]")
    void testExampleFirst() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        int[] expected = {1, 1, 2, 3, 4, 4};

        ListNode actual = mergeTwoLists(list1, list2);

        assertArrayEquals(expected, listToArray(actual));
    }

    @Test
    @DisplayName("Example 2: list1 = [], list2 = []")
    void testExampleSecond() {
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode merged = mergeTwoLists(list1, list2);
        assertNull(merged);
    }

    @Test
    @DisplayName("Example 3: list1 = [], list2 = [0]")
    void testExampleThird() {
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);

        int[] expected = {0};

        ListNode actual = mergeTwoLists(list1, list2);

        assertArrayEquals(expected, listToArray(actual));
    }

}