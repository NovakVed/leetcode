package neetCode.stack.generateParentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 22. Generate Parentheses
 * {@link} <a href=
 * "https://leetcode.com/problems/generate-parentheses/description/">22.
 * Generate Parentheses</a>
 */
class GenerateParenthesis {
    public void main(String[] args) {
        int n = 3;
        generateParenthesis(n).forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        Stack<Character> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        backtrack(n, 0, 0, stack, result);
        return result;
    }

    public void backtrack(int n, int openedN, int closedN, Stack<Character> stack, List<String> result) {
        if (n == openedN && openedN == closedN) {
            StringBuilder sb = new StringBuilder();
            for (char c : stack) {
                sb.append(c);
            }
            result.add(sb.toString());
        }

        if (openedN < n) {
            stack.push('(');
            backtrack(n, openedN + 1, closedN, stack, result);
            stack.pop();
        }

        if (closedN < openedN) {
            stack.push(')');
            backtrack(n, openedN, closedN + 1, stack, result);
            stack.pop();
        }
    }
}
