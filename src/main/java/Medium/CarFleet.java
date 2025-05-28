package Medium;

import java.util.Collections;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 0) return 0;

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < position.length; i++) {
            treeMap.put(position[i], speed[i]);
        }

        double[] time = new double[position.length];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            time[i] = (double) (target - entry.getKey()) / entry.getValue();
            i++;
        }

        Stack<Double> stack = new Stack<>();
        for (double value : time) {
            if (stack.isEmpty() || value > stack.peek()) stack.push(value);
        }

        return stack.size();
    }

}
