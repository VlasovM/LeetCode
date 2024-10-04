package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.easy.helperClasses.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Reverse linked list")
class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        ListNode inputList = new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3,
                new ListNode(2, new ListNode(1)))));

        System.out.println("input value listNote: " + inputList + " | expected result: " + expected);

        var actualResult = reverseLinkedList.reverseList(inputList);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        ListNode inputList = null;
        ListNode expected = null;

        System.out.println("input value listNote: " + inputList + " | expected result: " + expected);

        var actualResult = reverseLinkedList.reverseList(inputList);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        ListNode inputList = new ListNode(1, new ListNode(2));
        ListNode expected = new ListNode(2, new ListNode(1));

        System.out.println("input value listNote: " + inputList + " | expected result: " + expected);

        var actualResult = reverseLinkedList.reverseList(inputList);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }


}