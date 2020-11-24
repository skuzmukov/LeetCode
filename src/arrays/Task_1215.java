package arrays;

import java.util.Arrays;

//https://leetcode.com/problems/number-of-good-pairs/
public class Task_1215 {
    public int numIdenticalPairs(int[] nums) {
        if (nums.length < 2) { return 0; }
        Arrays.sort(nums);

        int curr = nums[0];
        int i = 1;
        int res = 0;
        int currRes = 1;

        while (i < nums.length) {
            if (curr == nums[i]) {
                currRes ++;
            } else {
                res += currRes * (currRes - 1) / 2;
                curr = nums[i];
                currRes = 1;
            }

            i++;
        }
        res += currRes * (currRes - 1) / 2;
        return res;

    }
}