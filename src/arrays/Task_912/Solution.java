package arrays.Task_912;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sortArray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        int[] sortArr = new int[max - min + 1];

        for (int i = 0; i < nums.length; i++) {
            sortArr[nums[i] - min] ++;
        }

        List<Integer> res = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < sortArr.length; i++) {
            while (sortArr[i] -- > 0) {
                res.add(i + min);
            }
        }

        return res;
    }
}