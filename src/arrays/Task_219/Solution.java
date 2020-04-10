package arrays.Task_219;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/contains-duplicate-ii/
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>(k);
        if (k >= nums.length - 1) {
            for (int i : nums) {
                if (!set.add(i)) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < k; i++) {
                set.add(nums[i]);
            }
            for (int i = k; i < nums.length; i++) {
                if (!set.add(nums[i])) {
                    return true;
                } else {
                    set.remove(nums[i - k]);
                }
            }
        }
        return false;
    }
}