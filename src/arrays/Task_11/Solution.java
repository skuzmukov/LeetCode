package arrays.Task_11;

public class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int value = 0;
        while (l != r) {
            value = Math.max(value, (r - l) * Math.min(height[r], height[l]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return value;
    }
}
