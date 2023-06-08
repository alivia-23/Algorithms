package LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The didgits are stored in reverse order
 * and each of their nodes contains a single digit. Add the two numbers and return the sum as a single liked list
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            sum += carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            cur.next = node;
            cur = node;
        }

        return dummy.next;

    }
}
