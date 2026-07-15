package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

public class MergeTwoSortedLists {

    // time complexity is O(n + m) and memory complexity is O(1)
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
