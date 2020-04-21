package arrays.Task_90;

import java.util.*;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        set.add(new ArrayList<>());
        int h = (int) Math.pow(2, nums.length) + 1;
        int t = (int) Math.pow(2, nums.length + 1);
        String bitMask;
        for (int num = h; num < t; num++) {
            bitMask = Integer.toBinaryString(num);
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i < bitMask.length(); i++) {
                if (bitMask.charAt(i) == '1') {
                    list.add(nums[i - 1]);
                }
            }
            set.add(list);
        }
        return new ArrayList<>(set);
    }
}