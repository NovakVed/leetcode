package neetCode.linkedList.reorderList;

import neetCode.linkedList.ListNode;

/**
 * 143. Reorder List
 * {@link} <a href=
 * "https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 */
public class ReorderList {
    public static void main(String[] args) {
        // Create a linked list: 0 -> 1 -> 2 -> 3
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        // Reverse the list and capture the new head
        reorderList(head);

        // Print the reversed linked list
        ListNode.printList(head);
    }

    public static void reorderList(ListNode head) {

    }
}
