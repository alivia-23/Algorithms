package Tree;

public class MaxElementOfBT {
    public static int findMaxValueInBT(Node root) {
        int maxValue = Integer.MIN_VALUE;
        if (root != null) {
            int leftMax = findMaxValueInBT(root.left);
            int rightMax = findMaxValueInBT(root.right);
            if (leftMax > rightMax) {
                maxValue = leftMax;
            } else {
                maxValue = rightMax;
            }
            if (root.data > maxValue) {
                maxValue = root.data;
            }
        }
        return maxValue;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
