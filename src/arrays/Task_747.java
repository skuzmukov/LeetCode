package arrays;
//https://leetcode.com/problems/largest-number-at-least-twice-of-others/
public class Task_747 {
    public int dominantIndex(int[] nums) {
        int ind = 0;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (max != nums[i] && max < 2 * nums[i]) {
                return -1;
            }
        }
        return ind;
    }
}
