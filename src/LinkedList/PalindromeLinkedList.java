package LinkedList;

/**
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 */
public class PalindromeLinkedList {
    public static boolean isPalindromeList(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        // find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the list next from middle
        ListNode prev = null;
        ListNode cur = slow;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // compare both halves
        fast = head;
        slow = prev;
        while (slow != null) {
            if (slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

}
