package LinkedList;

import java.util.List;

/**
 * You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 *
 * Example 1:
 * Input: head = [1,3,4,7,1,2,6]
 * Output: [1,3,4,1,2,6]
 *
 * Example 2:
 * Input: head = [1,2,3,4]
 * Output: [1,2,4]
 */
public class DeleteMiddleOfLinkedList {
    public static ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
