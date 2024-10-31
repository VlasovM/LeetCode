package ru.javlasov.medium;

import ru.javlasov.easy.helperClasses.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/add-two-numbers/description/
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return new ListNode();
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        // Сначала заполню коллекцию, в каждом жлементе которого будет лежать конечная цифра.
        List<Integer> tempListContainsSum = new ArrayList<>();

        // Эта переменная нужна для того, чтобы делать инкремент на единицу, если сумма > 10
        var tempValue = 0;
        while (l1 != null || l2 != null) {
            var correctedValL1 = l1 == null ? 0 : l1.getVal();
            var correctedValL2 = l2 == null ? 0 : l2.getVal();
            var sum = correctedValL1 + correctedValL2 + tempValue;

            // Это значение перед каждой итерацией мы должны обновить в 0. (т.к. учли её значение выше).
            tempValue = 0;

            // Если sum > 10, то пишем число result - 10 и запоминаем 1 (tempValue = 1)
            // Если sum = 10, то пишем 0, запоминаем 1
            // Иначе записываем сумму чисел. sum)
            if (sum > 10) {
                tempListContainsSum.add(sum - 10);
                tempValue = 1;
            } else if (sum == 10) {
                tempValue = 1;
                tempListContainsSum.add(0);
            } else {
                tempListContainsSum.add(sum);
            }
            l1 = l1 == null ? null : l1.getNext();
            l2 = l2 == null ? null : l2.getNext();

            // Если l1 == null и l2 == null, то это последняя итерация и нужно проверить временное значение
            // Если оно != 0, то его тоже надо внести
            if (l1 == null && l2 == null && tempValue != 0) {
                tempListContainsSum.add(tempValue);
            }

        }

        // Заполнение коллекции с обратного порядка
        ListNode resultListNode = new ListNode(tempListContainsSum.get(tempListContainsSum.size() - 1));
        for (int i = tempListContainsSum.size() - 2; i >= 0; i--) {
            resultListNode = new ListNode(tempListContainsSum.get(i), resultListNode);
        }

        return resultListNode;
    }

}
