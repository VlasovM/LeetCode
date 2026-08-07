package ru.javlasov.linkedList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static ru.javlasov.linkedList.CopyListWithRandomPointer.copyRandomList;

class CopyListWithRandomPointerTest {


    @Test
    @DisplayName("Example 1: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]")
    void testExampleFirst() {
        int[] values = {7, 13, 11, 10, 1};
        int[] randomIndices = {-1, 0, 4, 2, 0};
        ListNode original = buildList(values, randomIndices);
        ListNode copy = copyRandomList(original);
        assertDeepCopy(original, copy);
    }

    private ListNode buildList(int[] values, int[] randomIndices) {
        if (values.length == 0) return null;
        ListNode[] nodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new ListNode(values[i]);
        }
        // Связываем next через сеттер
        for (int i = 0; i < values.length - 1; i++) {
            nodes[i].setNext(nodes[i + 1]);
        }
        // Устанавливаем random через сеттер
        for (int i = 0; i < randomIndices.length; i++) {
            if (randomIndices[i] != -1) {
                nodes[i].setRandom(nodes[randomIndices[i]]);
            }
        }
        return nodes[0];
    }

    private void assertDeepCopy(ListNode original, ListNode copy) {
        if (original == null) {
            assertNull(copy);
            return;
        }

        Map<ListNode, ListNode> map = new HashMap<>();
        ListNode curOrig = original, curCopy = copy;
        while (curOrig != null && curCopy != null) {
            assertEquals(curOrig.getVal(), curCopy.getVal());
            assertNotSame(curOrig, curCopy);
            map.put(curOrig, curCopy);
            curOrig = curOrig.getNext();
            curCopy = curCopy.getNext();
        }
        assertNull(curOrig);
        assertNull(curCopy);

        curOrig = original;
        curCopy = copy;
        while (curOrig != null) {
            if (curOrig.getRandom() == null) {
                assertNull(curCopy.getRandom());
            } else {
                assertNotNull(curCopy.getRandom());
                ListNode expectedCopy = map.get(curOrig.getRandom());
                assertSame(expectedCopy, curCopy.getRandom());
            }
            curOrig = curOrig.getNext();
            curCopy = curCopy.getNext();
        }
    }

}