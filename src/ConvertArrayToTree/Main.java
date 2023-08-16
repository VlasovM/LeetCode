package ConvertArrayToTree;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {-10, -3, 0, 5, 9};
        sortedArrayToBST(array);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2; // Серединный элемент Ноды
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1); // левая часть
        midNode.right = buildSubBST(nums, mid + 1, end); // правая часть
        return midNode;
    }
}
