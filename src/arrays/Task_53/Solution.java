package arrays.Task_53;
//https://leetcode.com/problems/maximum-subarray/
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        for (int i : dp) {
            if (max < i) { max = i; }
        }
        return max;
    }
}