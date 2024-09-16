package neetCode.linkedList.reorderList;

import neetCode.linkedList.ListNode;

/**
 * 143. Reorder List
 * {@link} <a href=
 * "https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 */
public class ReorderList {
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next = new ListNode(5);

        // Reverse the list and capture the new head
        reorderList(head);

        // Print the reversed linked list
        ListNode.printList(head);
    }

    public static void reorderList(ListNode head) {
        ListNode slow = head, fast = head.next;

        // find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        ListNode prev = slow.next = null;

        // reverse second half
        while (second != null) {
            ListNode tmp = second.next;
            second.next = prev;
            prev = second;
            second = tmp;
        }

        // merge two halfs
        ListNode first = head;
        second = prev;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;
            first = tmp1;
            second = tmp2;
        }
    }
}
