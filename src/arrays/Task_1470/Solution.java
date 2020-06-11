package arrays.Task_1470;
//https://leetcode.com/problems/shuffle-the-array/
public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int ind = 0;
        for (int i = 0; i < n; i++) {
            arr[ind] = nums[i];
            ind += 2;
        }
        ind = 1;
        for (int i = n; i < nums.length; i++) {
            arr[ind] = nums[i];
            ind += 2;
        }
        return arr;
    }
}