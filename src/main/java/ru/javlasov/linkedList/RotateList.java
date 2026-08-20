package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Сложность: Medium
 * LeetCode: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/">...</a>
 * Сложность по времени: O(n) – один проход по списку, каждый узел посещается не более одного раза (включая внутренний цикл пропуска дубликатов).
 * Сложность по памяти: O(1) – используются только несколько указателей (без дополнительных структур).
 */

public class RotateList {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.getNext() == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode oldTail = null;
        ListNode current = head;
        while (current != null) {
            length++;
            oldTail = current;
            current = current.getNext();
        }

        int realK = k % length;
        if (realK == 0) {
            return head;
        }

        ListNode newTail = head;
        for (int i = 0; i < length - realK - 1; i++) {
            newTail = newTail.getNext();
        }

        ListNode newHead = newTail.getNext();

        oldTail.setNext(head);
        newTail.setNext(null);

        return newHead;
    }
}
