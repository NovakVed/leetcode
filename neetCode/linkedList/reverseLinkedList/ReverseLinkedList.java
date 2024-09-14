package neetCode.linkedList.reverseLinkedList;

import neetCode.linkedList.ListNode;

/**
 * 206. Reverse Linked List
 * {@link} <a href=
 * "https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked
 * List</a>
 */
class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list: 0 -> 1 -> 2 -> 3
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        // Reverse the list and capture the new head
        reverseList(head);

        // Print the reversed linked list
        ListNode.printList(head);
    }

    // Function to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextCurrent = null;

        while (current != null) {
            nextCurrent = current.next;
            current.next = previous;
            previous = current;
            current = nextCurrent;
        }

        return previous;
    }
}
