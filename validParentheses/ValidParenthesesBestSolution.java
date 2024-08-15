package validParentheses;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. ValidParentheses - best solution
 * {@link} <a href=
 * "https://leetcode.com/problems/valid-parentheses/description/">20.
 * ValidParentheses - best solution</a>
 */
public class ValidParenthesesBestSolution {
    public static void main(String[] args) {
        String example = "){";
        System.out.println(isValidParentheses(example));
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
