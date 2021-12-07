package arrays.Task_977;


public class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int h = 0;
        int t = nums.length - 1;
        int index = nums.length - 1;
        while (h <= t) {
            if (Math.abs(nums[h]) > nums[t]) {
                result[index--] = nums[h] * nums[h];
                h ++;
            } else {
                result[index--] = nums[t] * nums[t];
                t --;
            }
        }
        return result;
    }
}