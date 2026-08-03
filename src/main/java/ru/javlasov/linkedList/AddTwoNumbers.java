package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

/**
 * Complexity: Medium
 * LeetCode: <a href="https://leetcode.com/problems/add-two-numbers/description/">...</a>
 * Time complexity: O(max(m, n)) – where m and n are the lengths of the two linked lists; each node is processed once.
 * Memory complexity: O(max(m, n)) – for the new result list (plus O(1) extra for the dummy node and variables).
 */

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.getVal();
                l1 = l1.getNext();
            }
            if (l2 != null) {
                sum += l2.getVal();
                l2 = l2.getNext();
            }

            current.setNext(new ListNode(sum % 10));
            current = current.getNext();
            carry = sum / 10;
        }
        return dummy.getNext();
    }

}
