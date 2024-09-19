package Tree;

/**
 * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as
 * the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 * Example 1:
 * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * Output: 3
 */
public class LowestCommonAncestorBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        // if we find any node that matches p or q we return that node
        if (root.val == p.val || root.val == q.val) {
            return root;
        }
        // recursively search for matching p and q value in left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // recursively searh for matching p and q value in right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // if we find a node whose left and right both returns non null value
        // then we definitely can tell that's the lca node and return that node
        if (left != null && right != null) {
            return root;
        }

        // if left subtree returns null then the right subtree has the lca
        // so return right
        if (left == null) {
            return right;
        }
        // if right subtree returns null then the left subtree has the lca
        // so return left
        if (right == null) {
            return left;
        }
        return root;
    }

}
