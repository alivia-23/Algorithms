package Tree;

public class Tree {
    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
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

    }
}
