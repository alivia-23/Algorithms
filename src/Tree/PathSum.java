package Tree;

import java.util.Stack;

/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding
 * up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 *
 * Example 1:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 *
 * Example 2:
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 */
public class PathSum {

    // Recursion Approach
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSum(root, targetSum, 0);
    }

    private boolean hasPathSum(TreeNode root, int targetSum, int currSum) {
        if (root == null) return false;

        currSum += root.val;
        if (root.left == null && root.right == null && currSum == targetSum) {
            return true;
        }
        return hasPathSum(root.left, targetSum, currSum) ||
        hasPathSum(root.right, targetSum, currSum);

    }

    // Iteration Approach using two stack
    // 1 stack to keep track of the path nodes
    // 1 stack to keep track of the path sum
    public boolean hasPathSumIteration(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> pathNodes = new Stack<>();
        Stack<Integer> pathSum = new Stack<>();

        pathNodes.push(root);
        pathSum.push(root.val);

        while (!pathNodes.isEmpty()) {
            TreeNode currNode = pathNodes.pop();
            int currSum = pathSum.pop();

            // if this the leaf node and upto this node our current sum is equal to the target sum
            // then we found our path
            if (currNode.left == null && currNode.right == null && currSum == targetSum) {
                return true;
            }
            // else if current node is not a leaf node
            // then keep pushing its left and right nodes and their sum in the respective stacks

            if (currNode.left != null) {
                pathNodes.push(currNode.left);
                pathSum.push(currSum + currNode.left.val);
            }
            if (currNode.right != null) {
                pathNodes.push(currNode.right);
                pathSum.push(currSum + currNode.right.val);
            }
        }
        return false;
    }
}
