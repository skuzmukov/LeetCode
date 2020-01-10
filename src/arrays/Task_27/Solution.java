package arrays.Task_27;

public class Solution {
    // my method
    public int removeElement(int[] nums, int val) {
        //cheated
        if (nums.length == 1) {
            return val == nums[0] ? 0 : 1;
        }
        //cheated
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (i < nums.length && nums[i] != val) {i++;}
            while (j > 0 && nums[j] == val) {j--;}
            if (i < j) {
                nums[i] = nums[i] + nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            }
        }
        return i;
    }
    // find best decision
    public int removeElement1(int[] nums, int val) {
        int i = 0;
        for (int v : nums) {
            if (v != val) {
                nums[i++] = v;
            }
        }
        return i;
    }
}