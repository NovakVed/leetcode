package neetCode.stack.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisBest {
    public void main(String[] args) {
        int n = 3;
        generateParenthesis(n).forEach(System.out::println);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        gen(n, n, "", list);
        return list;
    }

    private static void gen(int opening, int closing, String path, List<String> paths) {
        if (opening == 0 && closing == 0) {
            paths.add(path);
            return;
        }

        if (opening > closing) {
            return;
        }

        if (opening > 0) {
            gen(opening - 1, closing, path + "(", paths);
        }

        if (closing > 0) {
            gen(opening, closing - 1, path + ")", paths);
        }
    }
}
