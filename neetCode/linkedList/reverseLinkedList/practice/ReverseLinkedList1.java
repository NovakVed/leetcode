package neetCode.linkedList.reverseLinkedList.practice;

import neetCode.linkedList.ListNode;

class ReverseLinkedList1 {
    public static void main(String[] args) {
        // Create a linked list: 0 -> 1 -> 2 -> 3
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        // Reverse the list and capture the new head
        ListNode reversed = reverseList(head);

        // Print the reversed linked list
        ListNode.printList(reversed);
    }

    // Function to reverse the linked list
    public static ListNode reverseList(ListNode head) {
        ListNode previous = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }
}
