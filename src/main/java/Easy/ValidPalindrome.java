package Easy;

import java.util.LinkedList;
import java.util.List;

public class ValidPalindrome {
    //1st attempt
    /*public boolean validPalindrome(String s) {
        if (s.isEmpty()) return true;

        List<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                list.add(Character.toLowerCase(c));
            }
        }

        int fromStart = 0;
        for (int i = list.size() - 1; i >= list.size()/2; i--) {
            if (!list.get(i).equals(list.get(fromStart)) ) {
                return false;
            }
            fromStart++;
        }

        return true;
    }*/
    //2nd attempt
    public boolean validPalindrome(String s) {
        if (s.isEmpty()) return true;

        int start = 0, end = s.length() - 1;
        while (start < end) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(end);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                end--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
