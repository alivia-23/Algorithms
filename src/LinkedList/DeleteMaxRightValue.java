package LinkedList;

import java.util.Stack;

/**
 * Given the head node of a singly linked list, modify the list such that any node that has a node with a greater value to its right gets removed.
 * The function should return the head of the modified list.
 *
 * Examples:
 *
 * Input: 5 -> 3 -> 7 -> 4 -> 2 -> 1
 * Output: 7 -> 4 -> 2 -> 1
 * Explanation: 5 and 3 are removed as they have nodes with larger values to their right.
 *
 * Input: 1 -> 2 -> 3 -> 4 -> 5
 * Output: 5
 * Explanation: 1, 2, 3, and 4 are removed as they have nodes with larger values to their right.
 */
public class DeleteMaxRightValue {
    public ListNode removeNode(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;

        while (cur != null) {
            while (!stack.isEmpty() && stack.peek().val < cur.val) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                stack.peek().next = cur;
            }
            stack.push((cur));
            cur = cur.next;
        }
        return stack.isEmpty() ? null : stack.get(0);
    }
}
