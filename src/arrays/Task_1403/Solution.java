package arrays.Task_1403;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order
public class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int[] sums = new int[nums.length];
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            sums[i] = s;
        }
        s = nums[nums.length - 1];
        int i;
        for (i = sums.length - 1; i > 0; i--) {
            if (s > sums[i - 1]) {
                break;
            }
            s += nums[i - 1];
        }
        List<Integer> res = new ArrayList<>();
        for (int ind = nums.length - 1; ind >= i; ind --) {
            res.add(nums[ind]);
        }
        return res;
    }
}