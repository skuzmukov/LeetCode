package arrays.Task_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j;
        for (j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                // i++, faster then nums[++i] = ...
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}