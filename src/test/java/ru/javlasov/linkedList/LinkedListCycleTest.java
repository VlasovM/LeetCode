package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.javlasov.linkedList.LinkedListCycle.hasCycleFirstSolution;
import static ru.javlasov.linkedList.LinkedListCycle.hasCycleSecondSolution;

class LinkedListCycleTest {

    private ListNode buildListWithCycle(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode[] nodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
        }

        // Связываем узлы последовательно
        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].setNext(nodes[i + 1]);
        }

        // Если pos >= 0, создаём цикл, указывая последний узел на nodes[pos]
        if (pos >= 0 && pos < values.length) {
            nodes[values.length - 1].setNext(nodes[pos]);
        }

        return nodes[0];
    }

    @Test
    @DisplayName("Example 1: head = [3,2,0,-4], pos = 1")
    void testExampleFirst() {
        ListNode head = buildListWithCycle(new int[]{3, 2, 0, -4}, 1);
        assertTrue(hasCycleFirstSolution(head));
        assertTrue(hasCycleSecondSolution(head));
    }

    @Test
    @DisplayName("Example 2: [1,2], pos = 0 -> true")
    void testExampleSecond() {
        ListNode head = buildListWithCycle(new int[]{1, 2}, 0);
        assertTrue(hasCycleFirstSolution(head));
        assertTrue(hasCycleSecondSolution(head));
    }

    @Test
    @DisplayName("Example 3: [1], pos = -1 -> false")
    void testExampleThird() {
        ListNode head = buildListWithCycle(new int[]{1}, -1);
        assertFalse(hasCycleFirstSolution(head));
        assertFalse(hasCycleSecondSolution(head));
    }

}