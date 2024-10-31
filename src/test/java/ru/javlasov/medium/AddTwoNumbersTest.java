package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.easy.helperClasses.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Add two numbers")
class AddTwoNumbersTest {

    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        ListNode inputL1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode inputL2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expectedList = new ListNode(7, new ListNode(0, new ListNode(8)));
        System.out.println("input value list 1: " + inputL1 +
                " | input value list 2: " + inputL2 + " | expected result: " + expectedList);

        var actualResult = addTwoNumbers.addTwoNumbers(inputL1, inputL2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedList);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        ListNode inputL1 = new ListNode(0);
        ListNode inputL2 = new ListNode(0);
        ListNode expectedList = new ListNode(0);
        System.out.println("input value list 1: " + inputL1 +
                " | input value list 2: " + inputL2 + " | expected result: " + expectedList);

        var actualResult = addTwoNumbers.addTwoNumbers(inputL1, inputL2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedList);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        ListNode inputL1 = new ListNode(9, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode inputL2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode expectedList = new ListNode(8, new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));
        System.out.println("input value list 1: " + inputL1 +
                " | input value list 2: " + inputL2 + " | expected result: " + expectedList);

        var actualResult = addTwoNumbers.addTwoNumbers(inputL1, inputL2);

        assertThat(actualResult).usingRecursiveComparison().isEqualTo(expectedList);
        System.out.println("----------------------------------------");
    }

}