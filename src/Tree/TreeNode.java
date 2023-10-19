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

    public TreeNode get(int value) {
        if (value == val) {
            return this;
        }
        if (value < val) {
            if (left != null) {
                return left.get(value);
            }
        } else {
            if (right != null) {
                return right.get(value);
            }
        }
        return null;
    }

    // Inorder traversal returns the value in sorted order
    public void traverseInorder() {
        if (left != null) {
            left.traverseInorder();
        }
        System.out.print(val + "," );
        if (right != null) {
            right.traverseInorder();
        }
    }

    // Find minimum value
    public int min() {
        if (left == null) {
            return val;
        }
        else {
            return left.min();
        }
    }
    // Find maximum value
    public int max() {
        if (right == null) {
            return val;
        } else {
            return right.max();
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

    public String toString() {
        return "Data = " + val;
    }
}
