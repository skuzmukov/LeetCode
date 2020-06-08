package arrays.Task_565;
//https://leetcode.com/problems/array-nesting/
public class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        int curr = 0;
        int k = 0;
        boolean[] isNested = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            k = i;
            curr = 0;
            while (!isNested[k]) {
                curr ++;
                isNested[k] = true;
                k = nums[k];
            }
            if (curr > max) { max = curr; }
        }
        return max;
    }
}