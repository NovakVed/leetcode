package leetcode.validParentheses;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. ValidParantheses - best solution
 * {@link} https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParanthesesBestSolution {
    public static void main(String[] args) {
        System.out.println(isValidParentheses("){"));
    }

    static boolean isValidParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        for (int i = 0; i < parentheses.length(); i++) {
            if (map.containsKey(parentheses.charAt(i))) {
                stack.push(parentheses.charAt(i));
            } else if (!stack.isEmpty() && parentheses.charAt(i) == map.get(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
