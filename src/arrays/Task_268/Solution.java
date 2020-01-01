package arrays.Task_268;


class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        return  nums.length * (1 + nums.length) / 2 - sum;
    }
}