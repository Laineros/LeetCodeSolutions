package Easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s==null || s.isEmpty() || s.length()==1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char ch = stack.pop();
                        if (ch == '{' && s.charAt(i) == '}') {
                        } else if (ch == '[' && s.charAt(i) == ']') {
                        } else if (ch == '(' && s.charAt(i) == ')') {
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
