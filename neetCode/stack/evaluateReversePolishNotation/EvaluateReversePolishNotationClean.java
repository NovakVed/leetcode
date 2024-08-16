package neetCode.stack.evaluateReversePolishNotation;

/**
 * 150. Evaluate Reverse Polish Notation
 * {@link} <a href=
 * "https://leetcode.com/problems/evaluate-reverse-polish-notation/description/">150. Evaluate Reverse Polish Notation</a>
 */
public class EvaluateReversePolishNotationClean {
    public static void main(String[] args) {
        String[] tokens = new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        System.out.println(evalRPN(tokens));
    }

    static int i;

    public static int evalRPN(String[] tokens) {
        i = tokens.length - 1;
        return eval(tokens);
    }

    public static int eval(String[] tokens) {
        return switch (tokens[i--]) {
            case "-" -> -eval(tokens) + eval(tokens);
            case "/" -> {
                var del = eval(tokens);
                yield eval(tokens) / del;
            }
            case "*" -> eval(tokens) * eval(tokens);
            case "+" -> eval(tokens) + eval(tokens);
            default -> Integer.valueOf(tokens[i + 1]);
        };
    }
}
