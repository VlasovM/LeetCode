package ru.javlasov.linkedList;

import ru.javlasov.utills.ListNode;

import java.util.HashSet;

/**
 * Complexity: Easy
 * LeetCode: <a href="https://leetcode.com/problems/linked-list-cycle/description/">...</a>
 */

public class LinkedListCycle {

    // Способ решения №1. Использование алгоритма Флойда для поиска цикла. https://www.geeksforgeeks.org/dsa/floyds-cycle-finding-algorithm/
    // Сложность по времени: O(n), где n — количество узлов в списке. В худшем случае (если цикла нет) указатель fast дойдёт
    // до конца списка за O(n) шагов. Если цикл есть, встреча произойдёт тоже за O(n) (точнее, не более чем за длину цикла, но в сумме с первой частью — O(n)).
    // Сложность по памяти: O(1) — используется только два указателя (slow и fast), никакой дополнительной памяти, зависящей от размера входных данных, не требуется.
    public static boolean hasCycleFirstSolution(ListNode head) {
        if (head == null || head.getNext() == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast.getNext() != null && fast.getNext().getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Способ решение №2. Использяю простой HashSet для отслеживания уже посещенных ListNode.
    // Сложность по времени: O(n) — один проход по списку, каждая операция с HashSet (contains и add) в среднем выполняется за O(1).
    // Сложность по памяти: O(n) — в худшем случае (если цикла нет) в HashSet сохраняются все n узлов.
    public static boolean hasCycleSecondSolution(ListNode head) {
        if (head == null || head.getNext() == null) {
            return false;
        }

        HashSet<ListNode> traversedNode = new HashSet<>();
        ListNode current = head;

        while (current != null) {
            if (traversedNode.contains(current)) {
                return true;
            }

            traversedNode.add(current);
            current = current.getNext();
        }

        return false;
    }

}
