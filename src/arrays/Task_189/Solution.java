package arrays.Task_189;
//https://leetcode.com/problems/rotate-array/
public class Solution {
    public void rotate(int[] nums, int k) {
        boolean[] checked = new boolean[nums.length];
        int ind;
        int temp;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!checked[i]) {
                temp = nums[i];
                ind = (i + k) % len;
                while (ind != i) {
                    checked[ind] = true;
                    nums[ind] = nums[ind] + temp;
                    temp = nums[ind] - temp;
                    nums[ind] = nums[ind] - temp;
                    ind = (ind + k) % len;
                }
                nums[i] = temp;
            }
        }
    }
}