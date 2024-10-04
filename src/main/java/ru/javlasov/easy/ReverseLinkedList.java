package ru.javlasov.easy;

import ru.javlasov.easy.helperClasses.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode nextNode = head.getNext();
        ListNode resultList = new ListNode();
        resultList.setVal(head.getVal());

        while (nextNode != null) {
            resultList = new ListNode(nextNode.getVal(), resultList);
            nextNode = nextNode.getNext();
        }

        return resultList;
    }

}
