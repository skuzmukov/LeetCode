package arrays.Task_1389;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.arraycopy(res, index[i], res, index[i] + 1, res.length - (index[i] + 1));
            res[index[i]] = nums[i];
        }
        return res;
    }
}
