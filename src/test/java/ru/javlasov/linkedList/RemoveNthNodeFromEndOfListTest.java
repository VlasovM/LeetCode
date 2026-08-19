package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.linkedList.RemoveNthNodeFromEndOfList.removeNthFromEnd;

class RemoveNthNodeFromEndOfListTest {

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
    @DisplayName("Example 1: head = [1,2,3,4,5], n = 2 -> [1,2,3,5]")
    void testExampleFirst() {
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode result = removeNthFromEnd(head, 2);
        int[] expected = {1, 2, 3, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Example 2: head = [1], n = 1 -> []")
    void testSingleNode() {
        ListNode head = buildList(new int[]{1});
        ListNode result = removeNthFromEnd(head, 1);
        assertNull(result);
    }

    @Test
    @DisplayName("Example 3: head = [1,2], n = 1 -> [1]")
    void testRemoveLast() {
        ListNode head = buildList(new int[]{1, 2});
        ListNode result = removeNthFromEnd(head, 1);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Remove head: [1,2,3], n = 3 -> [2,3]")
    void testRemoveHead() {
        ListNode head = buildList(new int[]{1, 2, 3});
        ListNode result = removeNthFromEnd(head, 3);
        int[] expected = {2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Remove middle: [1,2,3,4], n = 2 -> [1,2,4]")
    void testRemoveMiddle() {
        ListNode head = buildList(new int[]{1, 2, 3, 4});
        ListNode result = removeNthFromEnd(head, 2);
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, listToArray(result));
    }

}