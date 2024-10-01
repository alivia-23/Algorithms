package Tree;

/**
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 *
 * Each root-to-leaf path in the tree represents a number.
 *
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * Example 1:
 * Input: root = [1,2,3]
 * Output: 25
 *
 * Example 2:
 * Input: root = [4,9,0,5,1]
 * Output: 1026
 */
public class SumRootToLeaf {
    private int total;
    public int sumNumbers(TreeNode root) {
        total = 0;
        dfs(root, 0);
        return total;
    }

    private void dfs(TreeNode root, int sum) {
        if (root == null) return;

        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            total += sum;
            return;
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
    }
}
