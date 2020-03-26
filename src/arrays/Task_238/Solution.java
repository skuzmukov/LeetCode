package arrays.Task_238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lefted = new int[nums.length + 1];
        lefted[0] = 1;
        int[] righted = new int[nums.length + 1];
        righted[righted.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            lefted[i] = nums[i - 1] * lefted[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            righted[i] = nums[i] * righted[i + 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = lefted[i] * righted[i + 1];
        }

        return nums;
    }
}
