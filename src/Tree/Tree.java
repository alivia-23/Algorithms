package Tree;

public class Tree {
    private TreeNode root;

    // Insert value in a node
    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    // get matching value from the tree
    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    // find minimum value
    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    // find max value
    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    // Inorder traversal returns the value in sorted order
    public void traverseInorder() {
        if (root != null) {
            root.traverseInorder();
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInorder();
        System.out.println();
        System.out.println(tree.get(27));
        System.out.println(tree.get(15));
        System.out.println(tree.get(999));
        System.out.println("MIN VALUE = " + tree.min());
        System.out.println("MAX VALUE = " + tree.max());

    }
}
