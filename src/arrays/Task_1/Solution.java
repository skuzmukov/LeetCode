package arrays.Task_1;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(nums[0], 0);
        Integer curr;
        for (int i = 1; i < nums.length; i++) {
            curr = map.get(target - nums[i]);
            if (curr != null) {
                return new int[] {curr, i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}

/*
    Runtime: 1 ms, faster than 99.89% of Java online submissions for Two Sum.
    Memory Usage: 39.9 MB, less than 5.65% of Java online submissions for Two Sum.
*/