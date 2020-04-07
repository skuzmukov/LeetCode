package arrays.Task_33;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length < 1) { return -1; }
        int i = 0;
        while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
            i ++;
        }
        int res = Arrays.binarySearch(nums, 0, i + 1, target);
        if (res >= 0) { return res; }
        res = Arrays.binarySearch(nums, i + 1, nums.length, target);
        return res >= 0 ? res : -1;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == target) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}