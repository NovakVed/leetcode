package neetCode.evaluateReversePolishNotation;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class MyEvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Set<String> validOperators = new HashSet<>() {
            {
                add("+");
                add("-");
                add("*");
                add("/");
            }
        };
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (validOperators.contains(token)) {
                int result = Integer.parseInt(stack.pop());
                int currentToken = Integer.parseInt(stack.pop());
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(currentToken + result));
                        break;
                    case "-":
                        stack.push(String.valueOf(currentToken - result));
                        break;
                    case "*":
                        stack.push(String.valueOf(currentToken * result));
                        break;
                    case "/":
                        stack.push(String.valueOf(currentToken / result));
                        break;
                    default:
                        break;
                }
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
