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
        String curr;
        for (int i = h; i < t; i++) {
            List<Integer> list = new ArrayList<>();
            curr = Integer.toBinaryString(i);
            for (int ind = 1; ind < curr.length(); ind++) {
                if (curr.charAt(ind) == '1') {
                    list.add(nums[ind - 1]);
                }
            }
            res.add(list);
        }
        return res;
    }
}