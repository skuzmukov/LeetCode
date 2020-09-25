package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
public class Task_462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        int count = 0;

        for (int i = 0; i <= high; i++) {
            count +=Math.abs(nums[mid] - nums[i]);
        }

        return count;
    }
}