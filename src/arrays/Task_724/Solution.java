package arrays.Task_724;
//https://leetcode.com/problems/find-pivot-index/
class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int l = 0, r = 0;
        for (int i = 0; i < nums.length; i++) {
            l += nums[i];
            leftSum[i] = l;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            r += nums[i];
            rightSum[i] = r;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum[i] == rightSum[i]) {
                return i;
            }
        }

        return -1;
    }
}