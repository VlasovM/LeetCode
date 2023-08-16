package BinaryTreeInorderTraversal;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(1, null, new TreeNode(
//                2, new TreeNode(3, new TreeNode(3), null), null));
//        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);
//        TreeNode treeNode = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        TreeNode treeNode = new TreeNode(3, new TreeNode(1), new TreeNode(2, new TreeNode(1), null));
        inorderTraversal(treeNode);

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        // root.left == null && root.right == null
        // root.left == null && root.right != null
        // root.left != null && root.right == null
        // root.left != null && root.right != null

        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }

        return result;
    }
}
