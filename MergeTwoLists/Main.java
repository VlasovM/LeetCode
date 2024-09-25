package MergeTwoLists;

// https://leetcode.com/problems/merge-two-sorted-lists/?envType=list&envId=ribypp1e

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode list3 = new ListNode(6, new ListNode(10, new ListNode(40)));
        ListNode list4 = null;

        ListNode list5 = null;
        ListNode list6 = new ListNode(0);

        System.out.println(mergeTwoLists(list1, list2));
        System.out.println(mergeTwoLists(list3, list4));
        System.out.println(mergeTwoLists(list5, list6));

    }

    // it's not a good solution. but it's work
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> resultList = new ArrayList<>();
        boolean check = true;
        int count = 0;

        if (list1 != null) {
            ListNode listNode = list1.next;
            resultList.add(list1.val);

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
        }


        check = true;
        if (list2 != null) {
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
        }

        if (resultList.size() == 0) {
            return null;
        }

        Collections.sort(resultList);
        ListNode lastNode = new ListNode(resultList.get(resultList.size() - 1));
        int count2 = count - 1;
        for (int i = 0; i < count; count--) {
            if (count2 - 1 == -1) {
                break;
            }
            lastNode = new ListNode(resultList.get(count2 - 1), lastNode);
            count2--;
        }


        return lastNode;

    }

}
