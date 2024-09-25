package MaximumDepth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

//        TreeNode treeNode1 = new TreeNode(1,
//                new TreeNode(2, new TreeNode(3), null),
//                new TreeNode(2));
//        maxDepth(treeNode1);

//        TreeNode treeNode = new TreeNode(1,
//                new TreeNode(2),
//                new TreeNode(3, new TreeNode(4), new TreeNode(5)));
//        maxDepth(treeNode);
//
//        TreeNode treeNode2 = new TreeNode(1,
//                new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
//                null);
//        maxDepth(treeNode2);

        TreeNode treeNode3 = new TreeNode(1,
                null, new TreeNode(2));
        maxDepth(treeNode3);    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftLvl = maxDepth(root.left);
        int rightLvl = maxDepth(root.right);
        return Math.max(leftLvl, rightLvl) + 1;
    }

}
