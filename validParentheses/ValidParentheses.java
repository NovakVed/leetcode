package leetcode.validParentheses;

import java.util.Stack;

/**
 * ValidParantheses
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValidParentheses("){"));
    }

    static boolean isValidParentheses(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(' || brackets.charAt(i) == '[' || brackets.charAt(i) == '{') {
                stack.push(brackets.charAt(i));
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                switch (brackets.charAt(i)) {
                    case ')':
                        if (stack.peek().equals('(')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if (stack.peek().equals('[')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (stack.peek().equals('{')) {
                            stack.pop();
                        } else {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}