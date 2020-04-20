package arrays.Task_78;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/subsets/
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        int h = (int) Math.pow(2, nums.length) + 1;
        int t = (int) Math.pow(2, nums.length + 1);
        String mask;
        for (int num = h; num < t; num++) {
            List<Integer> list = new ArrayList<>();
            mask = Integer.toBinaryString(num);
            for (int i = 1; i < mask.length(); i++) {
                if (mask.charAt(i) == '1') {
                    list.add(nums[i - 1]);
                }
            }
            res.add(list);
        }
        return res;
    }
}