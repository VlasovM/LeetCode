package SymmetricTree;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        TreeNode treeNode0 = new TreeNode(1,
//                new TreeNode(4, null, new TreeNode(1, new TreeNode(2),null)),
//                new TreeNode(1, null, new TreeNode(4, new TreeNode(2), null)));
//        System.out.println("Must be FALSE: " + isSymmetric(treeNode0));

        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        System.out.println("Must be TRUE: " + isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);

    }

    public static  boolean isMirror(TreeNode t1, TreeNode t2) {
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
