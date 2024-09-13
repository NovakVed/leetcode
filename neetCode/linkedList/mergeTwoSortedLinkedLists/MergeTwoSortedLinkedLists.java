package neetCode.linkedList.mergeTwoSortedLinkedLists;

/**
 * 21. Merge Two Sorted Lists
 * {@link} <a href=
 * "https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted
 * Lists</a>
 */
class MergeTwoSortedLinkedLists {
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
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(5);

        // Reverse the list and capture the new head
        ListNode merged = mergeTwoLists(list1, list2);

        // Print the reversed linked list
        printList(merged);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }

            node = node.next;
        }

        while (list1 != null) {
            node.next = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            node.next = list2;
            list2 = list2.next;
        }

        return dummy.next;
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
