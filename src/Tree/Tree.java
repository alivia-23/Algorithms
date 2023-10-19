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

    // delete a node from the tree
    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) { // if tree is empty
            return subtreeRoot;
        }
        if (value < subtreeRoot.getVal()) {
            subtreeRoot.setLeft(delete(subtreeRoot.getLeft(), value));
        } else if (value > subtreeRoot.getVal()) {
            subtreeRoot.setRight(delete(subtreeRoot.getRight(), value));
        } else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeft() == null) {
                return subtreeRoot.getRight();
            }
            else if (subtreeRoot.getRight() == null) {
                return subtreeRoot.getLeft();
            } else {  // Case 3: node to delete has 2 children
                // replace the value in the subtreeRoot node with the smallest value
                // from the right subtree
                subtreeRoot.setVal(subtreeRoot.getRight().min());

                // delete the node that has the smallest value in the right subtree
                subtreeRoot.setRight(delete(subtreeRoot.getRight(), subtreeRoot.getVal()));
            }
        }
        return subtreeRoot;
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
        tree.insert(17);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInorder();
        System.out.println();
//        System.out.println(tree.get(27));
//        System.out.println(tree.get(15));
//        System.out.println(tree.get(999));
//        System.out.println("MIN VALUE = " + tree.min());
//        System.out.println("MAX VALUE = " + tree.max());

        tree.delete(17);
        tree.delete(29);
        tree.delete(25);
        tree.traverseInorder();
        System.out.println();
    }
}
