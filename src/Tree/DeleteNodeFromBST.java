package Tree;

/**
 * Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
 * Basically, the deletion can be divided into two stages:
 * Search for a node to remove.
 * If the node is found, delete the node.
 * Example:1
 * Input: root = [5,3,6,2,4,0,7], key = 3
 * Output: [5,4,6,2,null,null,7]
 */

public class DeleteNodeFromBST {

    // successor means the "next node" or the smallest node after the current node
    // so move one step right and then continue traversing to the left untill reach the required value
    public int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }
    // predecessor mean "before node" or the largest node before the current node
    // so we move one step left then we traverse right untill we reach the required value
    public int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        // delete from the right subtree if key is greater than current root value
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } // delete from the left subtree if key is less than current root value
        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } // we found the node to be deleted
        else { // Case 1. node to be deleted is a leaf node
            if (root.left == null && root.right == null) {
                root = null;
            } // Case 2. node to be deleted has 1 right child node
            else if (root.right != null) {
                root.val = successor(root); // smallest node after current node
                root.right = deleteNode(root, key);
            } // Case 2. node to be deleted has 1 left child node
            else if (root.left != null) {
                root.val = predecessor(root); // largest node before current node
                root.left = deleteNode(root, key);
            }
        }
        return root;
    }
}

