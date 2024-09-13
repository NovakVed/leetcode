package neetCode.linkedList.reverseLinkedList;

/**
 * 206. Reverse Linked List
 * {@link} <a href=
 * "https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked
 * List</a>
 */
class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // Create a linked list: 0 -> 1 -> 2 -> 3
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        // Reverse the list and capture the new head
        ListNode reversedHead = reverseList(head);

        // Print the reversed linked list
        printList(reversedHead);
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

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
