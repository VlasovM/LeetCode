package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Сложность: Medium
 * LeetCode: <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">...</a>
 * Сложность по времени: O(n) – один проход (fast сдвигается на n+1 шагов, затем оба указателя двигаются до конца).
 * Сложность по памяти: O(1) – используются только несколько указателей (без дополнительных структур).
 */
public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tempNode = new ListNode(0);
        tempNode.setNext(head);

        ListNode fast = tempNode;
        ListNode slow = tempNode;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.getNext();
        }

        while (fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        slow.setNext(slow.getNext().getNext());

        return tempNode.getNext();
    }

}
