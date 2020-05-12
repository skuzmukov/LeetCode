package arrays.Task_540;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }
}
