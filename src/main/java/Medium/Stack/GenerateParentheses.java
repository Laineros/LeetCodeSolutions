package Medium.Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, String cur, int open, int close, int max) {
        if (cur.length() == 2 * max) {
            result.add(cur);
            return;
        }
        if (open < max) {
            backtrack(result, cur + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(result, cur + ")", open, close + 1, max);
        }
    }
}
