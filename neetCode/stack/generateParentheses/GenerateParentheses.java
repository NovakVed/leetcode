package neetCode.stack.generateParentheses;

import java.util.List;
import java.util.Stack;

/**
 * 22. Generate Parentheses
 * {@link} <a href=
 * "https://leetcode.com/problems/generate-parentheses/description/">22.
 * Generate Parentheses</a>
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n).forEach(System.out::println);
    }

    public static List<String> generateParenthesis(int n) {
        Stack<String> stack = new Stack<>();

        return List.of();
    }
}