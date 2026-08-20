package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.linkedList.RotateList.rotateRight;

class RotateListTest {

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
    @DisplayName("Example 1: [1,2,3,4,5], k=2 -> [4,5,1,2,3]")
    void testExampleFirst() {
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode result = rotateRight(head, 2);
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Example 2: [0,1,2], k=4 -> [2,0,1] (k > length)")
    void testExampleSecond() {
        ListNode head = buildList(new int[]{0, 1, 2});
        ListNode result = rotateRight(head, 4);
        int[] expected = {2, 0, 1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("k = 0 -> no change")
    void testKZero() {
        ListNode head = buildList(new int[]{1, 2, 3});
        ListNode result = rotateRight(head, 0);
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Single node -> no change")
    void testSingleNode() {
        ListNode head = buildList(new int[]{1});
        ListNode result = rotateRight(head, 5);
        int[] expected = {1};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("k = length -> no change")
    void testKEqualsLength() {
        ListNode head = buildList(new int[]{1, 2, 3, 4});
        ListNode result = rotateRight(head, 4);
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Large k: [1,2,3], k=7 -> [3,1,2] (7 % 3 = 1)")
    void testLargeK() {
        ListNode head = buildList(new int[]{1, 2, 3});
        ListNode result = rotateRight(head, 7);
        int[] expected = {3, 1, 2};
        assertArrayEquals(expected, listToArray(result));
    }

}