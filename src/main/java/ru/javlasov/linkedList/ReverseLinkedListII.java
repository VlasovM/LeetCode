package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Сложность: Medium
 * LeetCode: <a href="https://leetcode.com/problems/reverse-linked-list-ii/description/">...</a>
 * Сложность по времени: O(n) – один проход до right (поиск prevLeft и разворот участка).
 * Сложность по памяти: O(1) – используются только несколько указателей, без дополнительных структур.
 */

public class ReverseLinkedListII {

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.getNext() == null || left == right) {
            return head;
        }

        ListNode temp = new ListNode(0, head);

        ListNode prevLeft = temp;
        for (int i = 0; i < left - 1; i++) {
            prevLeft = prevLeft.getNext();
        }

        ListNode start = prevLeft.getNext();

        ListNode prev = null;
        ListNode curr = start;

        int k = right - left + 1;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        prevLeft.setNext(prev);
        start.setNext(curr);

        return temp.getNext();
    }
}
