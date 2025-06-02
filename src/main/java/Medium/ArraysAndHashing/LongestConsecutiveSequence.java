package Medium.ArraysAndHashing;


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        for (int num : nums) {
            int count = 1;
            // left part
            int cur = num;
            while (set.contains(--cur)) {
                count++;
                set.remove(cur);
            }
            // right part
            cur = num;
            while (set.contains(++cur)) {
                count++;
                set.remove(cur);
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
