package Medium.ArraysAndHashing;

import java.util.*;

public class TopKFrequentElements {
    // 1st submit
   /* public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            int index = -1;
            int max=-1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() > max){
                    index = entry.getKey();
                    max = entry.getValue();
                }
            }
            result[i] = index;
            map.remove(index);
        }
        return result;
    }*/
    // 2st submit
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for (int pos = bucket.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (bucket[pos] != null) {
                result.addAll(bucket[pos]);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
