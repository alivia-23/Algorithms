package Tree;

/**
 * Given the roots of two binary trees 't1' and 't2', write a function to check if they are the same or not.
 * Two binary trees are considered the same if they met following two conditions:
 *
 * Both tree are structurally identical.
 * Each correst1onding node on both the trees have the same value.
 */

public class SameTree {
    public static boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return (t1.val == t2.val) && isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        t1.left = new TreeNode(4);
        t1.left.left = new TreeNode(1);
        t1.right = new TreeNode(15);
        t1.right.left = new TreeNode(14);

        TreeNode t2 = new TreeNode(10);
        t2.left = new TreeNode(4);
        t2.left.left = new TreeNode(1);
        t2.right = new TreeNode(15);
        t2.right.left = new TreeNode(14);

        SameTree tree1 = new SameTree();
        System.out.println(tree1.isSameTree(t1, t2));
    }
}
