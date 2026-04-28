package ru.javlasov.medium;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InsertDeleteGetRandomTest {

    @Test
    @DisplayName("Example 1: [\"RandomizedSet\", \"insert\", \"remove\", \"insert\", \"getRandom\"," +
            " \"remove\", \"insert\", \"getRandom\"]" +
            "[[], [1], [2], [2], [], [1], [2], []]")
    void testExampleFirst() {
        Map<Integer, Integer> allValuesExpected = new HashMap<>();
        InsertDeleteGetRandom randomizedSet = new InsertDeleteGetRandom();

        boolean insertFirstExpected = true;
        boolean insertFirstActual = randomizedSet.insert(1);
        allValuesExpected.put(1, 0);

        assertEquals(insertFirstExpected, insertFirstActual);

        boolean removeFirstExpected = false;
        boolean removeFirstActual = randomizedSet.remove(2);

        assertEquals(removeFirstExpected, removeFirstActual);

        boolean insertSecondExpected = true;
        boolean insertSecondActual = randomizedSet.insert(2);
        allValuesExpected.put(2, 1);

        assertEquals(insertSecondExpected, insertSecondActual);

        int randomFirstActual = randomizedSet.getRandom();
        assertTrue(allValuesExpected.containsKey(randomFirstActual));

        boolean removeSecondExpected = true;
        boolean removeSecondActual = randomizedSet.remove(1);
        allValuesExpected.remove(1);

        assertEquals(removeSecondExpected, removeSecondActual);

        boolean insertThirdExpected = false;
        boolean insertThirdActual = randomizedSet.insert(2);

        assertEquals(insertThirdExpected, insertThirdActual);

        int randomSecondActual = randomizedSet.getRandom();
        assertTrue(allValuesExpected.containsKey(randomSecondActual));
    }

    @Test
    @DisplayName("Example 1: [\"RandomizedSet\",\"remove\",\"remove\",\"insert\",\"getRandom\",\"remove\",\"insert\"]" +
            "[[],[0],[0],[0],[],[0],[0]]")
    void testExampleSecond() {
        Map<Integer, Integer> allValuesExpected = new HashMap<>();
        InsertDeleteGetRandom randomizedSet = new InsertDeleteGetRandom();

        boolean removeFirstExpected = false;
        boolean removeFirstActual = randomizedSet.remove(0);

        assertEquals(removeFirstExpected, removeFirstActual);

        boolean removeSecondExpected = false;
        boolean removeSecondActual = randomizedSet.remove(0);

        assertEquals(removeSecondExpected, removeSecondActual);

        boolean insertFirstExpected = true;
        boolean insertFirstActual = randomizedSet.insert(0);
        allValuesExpected.put(0, 0);

        assertEquals(insertFirstExpected, insertFirstActual);

        int randomFirstActual = randomizedSet.getRandom();
        assertTrue(allValuesExpected.containsKey(randomFirstActual));

        boolean removeThirdExpected = true;
        boolean removeThirdActual = randomizedSet.remove(0);
        allValuesExpected.remove(0);

        assertEquals(removeThirdExpected, removeThirdActual);

        boolean insertSecondExpected = true;
        boolean insertSecondActual = randomizedSet.insert(0);
        allValuesExpected.put(0, 0);

        assertEquals(insertSecondExpected, insertSecondActual);
    }

    @Test
    @DisplayName("Example 1: [\"RandomizedSet\",\"insert\",\"insert\",\"remove\",\"insert\",\"remove\",\"getRandom\"]" +
            "[[],[0],[1],[0],[2],[1],[]]")
    void testExampleThird() {
        Map<Integer, Integer> allValuesExpected = new HashMap<>();
        InsertDeleteGetRandom randomizedSet = new InsertDeleteGetRandom();

        boolean insertFirstExpected = true;
        boolean insertFirstActual = randomizedSet.insert(0);
        allValuesExpected.put(0, 0);

        assertEquals(insertFirstExpected, insertFirstActual);

        boolean insertSecondExpected = true;
        boolean insertSecondActual = randomizedSet.insert(1);
        allValuesExpected.put(1, 1);

        assertEquals(insertSecondExpected, insertSecondActual);

        boolean removeFirstExpected = true;
        boolean removeFirstActual = randomizedSet.remove(0);

        assertEquals(removeFirstExpected, removeFirstActual);

        boolean insertThirdExpected = true;
        boolean insertThirdActual = randomizedSet.insert(2);
        allValuesExpected.put(2, 2);

        assertEquals(insertThirdExpected, insertThirdActual);

        boolean removeSecondExpected = true;
        boolean removeSecondActual = randomizedSet.remove(1);
        allValuesExpected.remove(1);

        assertEquals(removeSecondExpected, removeSecondActual);

        int randomFirstActual = randomizedSet.getRandom();
        assertTrue(allValuesExpected.containsKey(randomFirstActual));
    }

}