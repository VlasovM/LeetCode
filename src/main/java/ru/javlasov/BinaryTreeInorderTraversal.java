package ru.javlasov;


import ru.javlasov.easy.helperClasses.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        } else if (root.getLeft() == null && root.getRight() == null) {
            return List.of(root.getVal());
        }

        List<Integer> resultList = new LinkedList<>();
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            current = stack.pop();
            resultList.add(current.getVal());
            current = current.getRight();
        }

        return resultList;
    }

}
