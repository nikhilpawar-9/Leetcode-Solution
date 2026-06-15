/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
                // Base Case: If the list contains 0 or 1 node, deleting the middle leaves it empty
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow at the head
        ListNode slow = head;
        // Start fast two steps ahead so slow stays exactly one step behind the middle
        ListNode fast = head.next.next;

        // Traverse the list until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move slow 1 step
            fast = fast.next.next;     // Move fast 2 steps
        }

        // slow is now right before the middle node. Bypass the middle node.
        slow.next = slow.next.next;

        // Return the head of the modified linked list
        return head;
    }
}