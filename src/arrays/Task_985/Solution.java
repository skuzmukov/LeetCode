package arrays.Task_985;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int[] res = new int[nums.length];
        int sum = 0;
        int val;
        for (int i : nums) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if ((nums[q[i][1]] & 1) == 0) {
                sum -= nums[q[i][1]];
            }
            val = q[i][0] + nums[q[i][1]];
            if ((val & 1) == 0) {
                sum += val;
            }
            res[i] = sum;
            nums[q[i][1]] = val;
        }

        return res;
    }
}