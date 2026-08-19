package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static ru.javlasov.linkedList.RemoveDuplicatesFromSortedListII.deleteDuplicates;

class RemoveDuplicatesFromSortedListIITest {

    private ListNode buildList(int[] values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.setNext(new ListNode(values[i]));
            current = current.getNext();
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.getVal());
            head = head.getNext();
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    // ===== Тесты =====

    @Test
    @DisplayName("Example 1: [1,2,3,3,4,4,5] -> [1,2,5]")
    void testExampleFirst() {
        ListNode head = buildList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode result = deleteDuplicates(head);
        int[] expected = {1, 2, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("All duplicates except one: [1,1,1,2,3] -> [2,3]")
    void testAllDuplicatesExceptOne() {
        ListNode head = buildList(new int[]{1, 1, 1, 2, 3});
        ListNode result = deleteDuplicates(head);
        int[] expected = {2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("All same values: [1,1,1] -> []")
    void testAllSame() {
        ListNode head = buildList(new int[]{1, 1, 1});
        ListNode result = deleteDuplicates(head);
        assertNull(result);
    }

    @Test
    @DisplayName("Single node: [1] -> [1]")
    void testSingleNode() {
        ListNode head = buildList(new int[]{1});
        ListNode result = deleteDuplicates(head);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Duplicates at end: [1,2,2] -> [1]")
    void testDuplicatesAtEnd() {
        ListNode head = buildList(new int[]{1, 2, 2});
        ListNode result = deleteDuplicates(head);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Duplicates at start: [1,1,2,3] -> [2,3]")
    void testDuplicatesAtStart() {
        ListNode head = buildList(new int[]{1, 1, 2, 3});
        ListNode result = deleteDuplicates(head);
        int[] expected = {2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Multiple duplicate groups: [1,2,2,3,3,4] -> [1,4]")
    void testMultipleDuplicateGroups() {
        ListNode head = buildList(new int[]{1, 2, 2, 3, 3, 4});
        ListNode result = deleteDuplicates(head);
        int[] expected = {1, 4};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("No duplicates: [1,2,3,4] -> [1,2,3,4]")
    void testNoDuplicates() {
        ListNode head = buildList(new int[]{1, 2, 3, 4});
        ListNode result = deleteDuplicates(head);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, listToArray(result));
    }

}