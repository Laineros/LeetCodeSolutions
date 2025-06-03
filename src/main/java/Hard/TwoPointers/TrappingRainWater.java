package Hard.TwoPointers;

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height.length == 0) return 0;

        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        int water = 0;

        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
            }
        }

        return water;
    }
}
