package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Сложность: Medium
 * LeetCode: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/">...</a>
 * Сложность по времени: O(n) – один проход по списку, каждый узел посещается не более одного раза (включая внутренний цикл пропуска дубликатов).
 * Сложность по памяти: O(1) – используются только несколько указателей (без дополнительных структур).
 */
public class RemoveDuplicatesFromSortedListII {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.setNext(head);
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.getNext() != null && current.getVal() == current.getNext().getVal()) {
                int dupVal = current.getVal();
                while (current != null && current.getVal() == dupVal) {
                    current = current.getNext();
                }
                prev.setNext(current);
            } else {
                prev = current;
                current = current.getNext();
            }
        }

        return dummy.getNext();
    }
}
