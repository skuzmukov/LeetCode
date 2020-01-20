package arrays.Task_1313;

public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] res = new int[size];

        int j = 0;
        for (int i = 0; i < nums.length; i += 2) {
            while (nums[i] -- > 0) {
                res[j++] = nums[i + 1];
            }
        }

        return res;
    }
}
