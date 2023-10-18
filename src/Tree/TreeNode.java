package Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void insert(int value) {
        if (value == val) return;

        if (value < val) {
            if (left == null) {
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
        }
    }

    // Inorder traversal returns the value in sorted order
    public void traverseInorder() {
        if (left != null) {
            left.traverseInorder();
        }
        System.out.println("Root data= " + val + "," );
        if (right != null) {
            right.traverseInorder();
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
