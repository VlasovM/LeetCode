package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.utills.ListNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static ru.javlasov.medium.AddTwoNumbers.addTwoNumbers;

class AddTwoNumbersTest {

    private int[] listToArray(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.getVal());
            head = head.getNext();
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    @DisplayName("Example 1: l1 = [2,4,3], l2 = [5,6,4]")
    void testExampleFirst() {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        int[] expected = {7, 0, 8};

        ListNode actual = addTwoNumbers(list1, list2);

        assertArrayEquals(expected, listToArray(actual));
    }

    @Test
    @DisplayName("Example 2: l1 = [0], l2 = [0]")
    void testExampleSecond() {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        int[] expected = {0};

        ListNode actual = addTwoNumbers(list1, list2);

        assertArrayEquals(expected, listToArray(actual));
    }

    @Test
    @DisplayName("Example 3: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]")
    void testExampleThird() {
        ListNode list1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode list2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        int[] expected = {8, 9, 9, 9, 0, 0, 0, 1};

        ListNode actual = addTwoNumbers(list1, list2);

        assertArrayEquals(expected, listToArray(actual));
    }

}