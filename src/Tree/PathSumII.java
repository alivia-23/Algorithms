package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree and an integer targetSum, return all root-to-leaf paths where the sum of the node values
 * in the path equals targetSum. Each path should be returned as a list of the node values, not node references.
 * A root-to-leaf path is a path starting from the root and ending at any leaf node. A leaf is a node with no children.
 *
 * Example 1:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * Output: [[5,4,11,2],[5,8,4,5]]
 */
public class PathSumII {
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPath(root, targetSum, 0, result, new ArrayList<>());
        return result;
    }

    private static void findPath(TreeNode root, int targetSum, int currSum, List<List<Integer>> result, List<Integer> currPath) {
        if (root == null) return;

        currSum += root.val;
        currPath.add(root.val);

        if (root.left == null && root.right == null && targetSum == currSum) {
            result.add(new ArrayList<>(currPath));
        }
        findPath(root.left, targetSum, currSum, result, currPath);
        findPath(root.right, targetSum, currSum, result, currPath);

        currPath.remove(currPath.size() - 1);
    }
}
