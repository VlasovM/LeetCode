package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Сложность: Medium
 * LeetCode: <a href="https://leetcode.com/problems/copy-list-with-random-pointer/description/">...</a>
 * Сложность по времени: O(n) – два прохода.
 * Сложность по памяти: O(n) – хранение карты.
 */

public class CopyListWithRandomPointer {

    public static ListNode copyRandomList(ListNode head) {
        if (head == null) {
            return null;
        }

        Map<ListNode, ListNode> oldNewNodesMap = new HashMap<>();
        ListNode current = head;

        while (current != null) {
            oldNewNodesMap.put(current, new ListNode(current.getVal()));
            current = current.getNext();
        }

        current = head;
        while (current != null) {
            ListNode newNode = oldNewNodesMap.get(current);
            newNode.setNext(oldNewNodesMap.get(current.getNext()));
            newNode.setRandom(oldNewNodesMap.get(current.getRandom()));
            current = current.getNext();
        }

        return oldNewNodesMap.get(head);
    }

}
