package neetCode.stack.validParentheses.practice;

import java.util.Map;
import java.util.Stack;

class ValidParentheses2 {
    public static void main(String[] args) {
        String brackets = "([{}])";
        System.out.println(isValidParentheses(brackets));
    }

    static boolean isValidParentheses(String s) {
        Map<Character, Character> brackets = Map.of(
                ')', '(',
                '}', '{',
                ']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (brackets.containsKey(currentChar)) {
                if (stack.isEmpty() || !stack.pop().equals(brackets.get(currentChar)))
                    return false;
            } else
                stack.add(currentChar);
        }

        return stack.isEmpty();
    }
}
