package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.linkedList.ReverseLinkedListII.reverseBetween;

class ReverseLinkedListIITest {

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

    @Test
    @DisplayName("Example 1: head = [1,2,3,4,5], left = 2, right = 4")
    void testExampleFirst() {
        ListNode head = buildList(new int[]{1, 2, 3, 4, 5});
        ListNode result = reverseBetween(head, 2, 4);
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, listToArray(result));
    }

    @Test
    @DisplayName("Example 2: head = [5], left = 1, right = 1")
    void testExampleSecond() {
        ListNode head = buildList(new int[]{5});
        ListNode result = reverseBetween(head, 1, 1);
        int[] expected = {5};
        assertArrayEquals(expected, listToArray(result));
    }

}