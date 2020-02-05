package arrays.Task_283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int h = 0;
        while (h < nums.length && nums[h] != 0) {h++;}
        int t = h + 1;
        while (t < nums.length) {
            while (t < nums.length && nums[t] == 0) {
                t++;
            }
            if (t < nums.length) {
                nums[h++] = nums[t++];
            }
        }
        while (h < nums.length) {
            nums[h++] = 0;
        }
    }
}