package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.easy.HelperClasses.ListNode;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Merge sorted list")
class MergeSortedListTest {

    private final MergeSortedList mergeSortedList = new MergeSortedList();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        ListNode inputList1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode inputList2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4))))));

        System.out.println("input value listNote1: " + inputList1 + " | input value listNote2: "
                + inputList1 + " | expected result: " + expected);

        var actualResult = mergeSortedList.mergeTwoLists(inputList1, inputList2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        ListNode inputList1 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5))));
        ListNode inputList2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(4, new ListNode(5)))))));

        System.out.println("input value listNote1: " + inputList1 + " | input value listNote2: "
                + inputList2 + " | expected result: " + expected);

        var actualResult = mergeSortedList.mergeTwoLists(inputList1, inputList2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        ListNode inputList1 = new ListNode(2, null);
        ListNode inputList2 = new ListNode(1, null);
        ListNode expected = new ListNode(1, new ListNode(2, null));

        System.out.println("input value listNote1: " + inputList1 + " | input value listNote2: "
                + inputList2 + " | expected result: " + expected);

        var actualResult = mergeSortedList.mergeTwoLists(inputList1, inputList2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expected);

        System.out.println("----------------------------------------");
    }


}