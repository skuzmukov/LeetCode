package arrays.Task_35;

import java.util.Arrays;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int ind = Arrays.binarySearch(nums, target);
        return ind < 0 ? (-1) * ind - 1 : ind;
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
Memory Usage: 39.6 MB, less than 88.29% of Java online submissions for Search Insert Position.
*/
