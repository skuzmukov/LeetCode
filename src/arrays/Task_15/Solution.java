package arrays.Task_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int tempSum;
        int index;
        int j;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            index = i + 1;
            j = nums.length - 1;
            while (index < j) {
                tempSum = nums[i] + nums[j] + nums[index];
                if (tempSum == 0) {
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[index]);
                    res.add(arr);
                    while (index < j && nums[index] == nums[index + 1]) {
                        index ++;
                    }
                    while (index < j && nums[j] == nums[j - 1]) {
                        j --;
                    }
                    index++;
                } else if (tempSum > 0) {
                    j --;
                } else {
                    index++;
                }
            }
        }
        return res;
    }
}


class A {
    public static void main(String[] args) {
        new Solution().threeSum(new int[] {-1,0,1,2,-1,-4});
    }
}