package ru.javlasov.easy;

import ru.javlasov.easy.HelperClasses.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 * <p>
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        List<Integer> tempListForVal = new ArrayList<>();

        ListNode currentListNodeFirstList = list1.getNext();
        ListNode currentListNodeSecondList = list2.getNext();
        tempListForVal.add(list1.getVal());
        tempListForVal.add(list2.getVal());

        while (currentListNodeFirstList != null || currentListNodeSecondList != null) {
            if (currentListNodeFirstList != null) {
                tempListForVal.add(currentListNodeFirstList.getVal());
                currentListNodeFirstList = currentListNodeFirstList.getNext();
            }
            if (currentListNodeSecondList != null) {
                tempListForVal.add(currentListNodeSecondList.getVal());
                currentListNodeSecondList = currentListNodeSecondList.getNext();
            }
        }

        Collections.sort(tempListForVal);
        Collections.reverse(tempListForVal);
        ListNode currentListNote = null;

        for (Integer val : tempListForVal) {
            currentListNote = new ListNode(val, currentListNote);
        }

        return currentListNote;
    }
}
