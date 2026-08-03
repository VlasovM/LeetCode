package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">...</a>
 * Time complexity: O(m + n) – each node from both lists is processed exactly once.
 * Memory complexity: O(1) – only a few pointers (dummy, current) are used; we reuse existing nodes.
 */

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.getVal() <= list2.getVal()) {
                current.setNext(list1);
                list1 = list1.getNext();
            } else {
                current.setNext(list2);
                list2 = list2.getNext();
            }

            current = current.getNext();
        }

        if (list1 == null) {
            current.setNext(list2);
        } else {
            current.setNext(list1);
        }

        return dummy.getNext();
    }

}
