package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static ru.javlasov.easy.RemoveElement.removeElement;

class RemoveElementTest {

    private void printInputValues(int[] nums, int val, int expectedK, int[] expectedNums) {
        System.out.println("input: nums: " + Arrays.toString(nums) + " val = " + val);
        System.out.println("expected nums: " + Arrays.toString(expectedNums) + " expectedK: " + expectedK);
    }

    @Test
    @DisplayName("Удаление элемента в начале и конце массива")
    void removeElement_WhenValueAtStartAndEnd_ShouldReturnCorrectCount() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;


        int[] expectedNums = {2, 2};
        int expectedK = 2;
        printInputValues(nums, val, expectedK, expectedNums);

        int k = removeElement(nums, val);

        assertEquals(expectedK, k);
        for (int i = 0; i < k; i++) {
            assertEquals(expectedNums[i], nums[i],
                    "Элемент на позиции " + i + " не соответствует ожидаемому");
        }
    }

    @Test
    @DisplayName("Удаление элемента, встречающегося несколько раз")
    void removeElement_WhenValueAppearsMultipleTimes_ShouldReturnCorrectCount() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int[] expectedNums = {0, 1, 3, 0, 4, 2};
        int expectedK = 5;
        printInputValues(nums, val, expectedK, expectedNums);

        int k = removeElement(nums, 2);

        assertEquals(expectedK, k);
        for (int i = 0; i < k; i++) {
            assertNotEquals(val, nums[i],
                    "Элемент на позиции " + i + " равен " + val + ", но не должен");
        }
    }

    @Test
    @DisplayName("Удаление элемента, встречающегося один раз")
    void removeElement_WhenValueAppearsOnce_ShouldReturnCorrectCount() {
        int[] nums = {1, 2, 3};
        int val = 2;

        int[] expectedNums = {1, 3};
        int expectedK = 2;
        printInputValues(nums, val, expectedK, expectedNums);

        int k = removeElement(nums, 2);

        assertEquals(expectedK, k);
        for (int i = 0; i < k; i++) {
            assertNotEquals(val, nums[i],
                    "Элемент на позиции " + i + " равен " + val + ", но не должен");
        }
    }
}