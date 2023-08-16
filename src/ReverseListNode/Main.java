package ReverseListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(reverseList(listNode));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> valNode = new ArrayList<>();
        ListNode currentNode = head;
        ListNode result = null;

        int i = 0;
        int b = Integer.MAX_VALUE;

        while (i < b) {
            if (currentNode != null) {
                valNode.add(currentNode.val);
                currentNode = currentNode.next;
                b = valNode.size();
            } else {
                result = new ListNode(valNode.get(i), result);
                i++;
            }
        }
        return result;
    }
}
