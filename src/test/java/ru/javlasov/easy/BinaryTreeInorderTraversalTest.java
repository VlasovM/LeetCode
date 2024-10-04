package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.javlasov.BinaryTreeInorderTraversal;
import ru.javlasov.easy.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Binary Tree Inorder Traversal")
class BinaryTreeInorderTraversalTest {

    private final BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        TreeNode input = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        List<Integer> expected = Arrays.asList(1, 3, 2);

        System.out.println("input value listNote: " + input + " | expected result: " + expected);

        List<Integer> actualResult = binaryTreeInorderTraversal.inorderTraversal(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioSecond() {
        System.out.println("----------------------------------------");
        System.out.println("scenario second: ");
        TreeNode input = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5, new TreeNode(6), new TreeNode(7))),
                new TreeNode(3, null, new TreeNode(8, new TreeNode(9), null)));
        List<Integer> expected = Arrays.asList(4, 2, 6, 5, 7, 1, 3, 9, 8);

        System.out.println("input value listNote: " + input + " | expected result: " + expected);

        List<Integer> actualResult = binaryTreeInorderTraversal.inorderTraversal(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioThird() {
        System.out.println("----------------------------------------");
        System.out.println("scenario third: ");
        TreeNode input = null;
        List<Integer> expected = new ArrayList<>();

        System.out.println("input value listNote: " + input + " | expected result: " + expected);

        List<Integer> actualResult = binaryTreeInorderTraversal.inorderTraversal(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

    @Test
    void testScenarioFourth() {
        System.out.println("----------------------------------------");
        System.out.println("scenario fourth: ");
        TreeNode input = new TreeNode(1);
        List<Integer> expected = List.of(1);

        System.out.println("input value listNote: " + input + " | expected result: " + expected);

        List<Integer> actualResult = binaryTreeInorderTraversal.inorderTraversal(input);

        assertThat(actualResult).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }

}