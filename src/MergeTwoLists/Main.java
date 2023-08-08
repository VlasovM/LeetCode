package MergeTwoLists;

// https://leetcode.com/problems/merge-two-sorted-lists/?envType=list&envId=ribypp1e

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5)))));
        ListNode list2 = new ListNode(6, new ListNode(10, new ListNode(40)));

        ListNode list3 = new ListNode();
        ListNode list4 = new ListNode();

        ListNode list5 = new ListNode(0);
        ListNode list6 = new ListNode();
        System.out.println(list5);
        System.out.println(list6);

        System.out.println(mergeTwoLists(list1, list2));
        System.out.println(mergeTwoLists(list3, list4));
        System.out.println(mergeTwoLists(list5, list6));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> resultList = new ArrayList<>();
        boolean check = true;
        ListNode listNode = list1.next;
        resultList.add(list1.val);
        int count = 0;
        while (check) {
            if (listNode != null) {
                resultList.add(listNode.val);
                listNode = listNode.next;
                count++;
            } else {
                check = false;
                count++;
            }
        }

        check = true;
        ListNode listNode2 = list2.next;
        resultList.add(list2.val);
        while (check) {
            if (listNode2 != null) {
                resultList.add(listNode2.val);
                listNode2 = listNode2.next;
                count++;
            } else {
                check = false;
                count++;
            }
        }
        Collections.sort(resultList);
        ListNode lastNode = new ListNode(resultList.get(count-1));

        for (int i = 0; i < count; count--) {
            if (count == resultList.size()) {
                lastNode = new ListNode(resultList.get(count-2), lastNode);
            } else {
                lastNode = new ListNode(resultList.get(count-1), lastNode);
            }
        }

        return lastNode;

    }

}
