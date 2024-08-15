package neetCode.stacks.validParentheses.practice;

import java.util.Map;
import java.util.Stack;

class ValidParentheses1 {
    public static void main(String[] args) {
        String brackets = "([{}])";
        System.out.println(isValidParentheses(brackets));
    }

    static boolean isValidParentheses(String brackets) {
        Map<Character, Character> supportedBrackets = Map.of(
                ')', '(',
                '}', '{',
                ']', '[');
        Stack<Character> stack = new Stack<>();
        for (Character bracket : brackets.toCharArray()) {
            if (supportedBrackets.containsKey(bracket)) {
                if (stack.isEmpty() || !stack.pop().equals(supportedBrackets.get(bracket))) {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }
        return stack.isEmpty();
    }
}
