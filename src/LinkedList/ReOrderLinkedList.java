package LinkedList;

import java.util.List;

/**
 * Given the head of a Singly LinkedList, write a method to modify the LinkedList such that the nodes from the second half of
 * the LinkedList are inserted alternately to the nodes from the first half in reverse order.
 * So if the LinkedList has nodes 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null, your method should return 1 -> 6 -> 2 -> 5 -> 3 -> 4 -> null.
 *
 * Your algorithm should not use any extra space and the input LinkedList should be modified in-place.
 *
 * Example 1:
 * Input: 2 -> 4 -> 6 -> 8 -> 10 -> 12 -> null
 * Output: 2 -> 12 -> 4 -> 10 -> 6 -> 8 -> null
 *
 * Example 2:
 * Input: 2 -> 4 -> 6 -> 8 -> 10 -> null
 * Output: 2 -> 10 -> 4 -> 8 -> 6 -> null
 */
public class ReOrderLinkedList {
    public static void reOrderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        // find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse from middle
        ListNode prev = null;
        ListNode cur = slow;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // merge both halves from middle
        fast = head;
        slow = prev;
        while (slow != null && slow.next != null) {
            ListNode next = fast.next;
            fast.next = slow;
            fast = next;

            next = slow.next;
            slow.next = fast;
            slow = next;
        }
    }

}
