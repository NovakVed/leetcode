package neetCode.stack.minStack;

/**
 * 155. Min Stack
 * {@link} <a href="https://leetcode.com/problems/min-stack/description/">155.
 * Min Stack</a>
 */
class MinStack {

    Node head;

    class Node {
        int value;
        Node next;
        int minValue;

        Node(int value) {
            this.value = value;
            this.next = null;
            this.minValue = value;
        }
    }

    public MinStack() {
        head = null;
    }

    public void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top()); // return 0
        System.out.println(minStack.getMin()); // return -2
    }

    public void push(int val) {
        Node newNode = new Node(val);
        if (head != null && newNode.minValue > head.minValue) {
            newNode.minValue = head.minValue;
        }
        newNode.next = head;
        head = newNode;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.minValue;
    }
}
