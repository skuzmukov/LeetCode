package arrays.Task_1295;

class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] > 0) {
                count ++;
                nums[i] /= 10;
            }
            if ((count & 1) == 0) {
                res ++;
            }
            count = 0;
        }
        return res;
    }
}