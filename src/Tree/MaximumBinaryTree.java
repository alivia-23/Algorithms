package Tree;

public class MaximumBinaryTree {
    public TreeNode maxBinaryTree(int[] nums) {
        if (nums == null) {
            return null;
        }
        return build(nums, 0, nums.length - 1);
    }

    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // find the index in the array which contains the maximum value
        int maxIdx = left;
        for (int i = left; i <= right; i++) {
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        //  create the root node with the max value
        TreeNode root = new TreeNode(nums[maxIdx]);

        // build the left and right subtree by recursively calling the build method
        // left subtree will be formed by the left element of the max vaLue
        // right subtree will be formed by the right element of the max value
        root.left = build(nums, left, maxIdx - 1);
        root.right = build(nums, maxIdx + 1, right);

        return root;
    }
}
