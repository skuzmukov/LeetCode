package arrays.Task_704;

public class Solution {
    public int search(int[] nums, int target) {
        int h = 0;
        int t = nums.length - 1;
        int m = -1;
        while (h <= t) {
            m = (h + t) / 2;
            if (nums[m] == target) {
                return m;
            } else if (target < nums[m]) {
                t = m - 1;
            } else {
                h = m + 1;
            }
        }
        return -1;
    }
}