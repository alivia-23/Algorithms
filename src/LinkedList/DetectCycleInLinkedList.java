package LinkedList;

/**
 * Given the head of a Singly LinkedList, write a function to determine if the LinkedList has a cycle in it or not.
 *
 * Example 1 :
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 *
 * Example 2 :
 * Input: head = [1,2], pos = 0
 * Output: true
 */
public class DetectCycleInLinkedList {

    public static boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
