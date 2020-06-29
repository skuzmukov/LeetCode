package arrays.Task_643;
//https://leetcode.com/problems/maximum-average-subarray-i/
public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int temp = sum;
        for (int i = k; i < nums.length; i++) {
            temp -= nums[i - k];
            temp += nums[i];
            if (sum < temp) { sum = temp; } // no need to calculate avg on each step - is temp is greater then sum then select temp as sum
        }
        return sum * 1D / k;
    }
}