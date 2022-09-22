package binary.Task_153;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int m;
        while (l <= r) {
            if (r - l < 2) {
                return Math.min(nums[l], nums[r]);
            } else {
                m = (r + l) / 2;
                if (nums[m - 1] > nums[m] && nums[m] < nums[m + 1]) {
                    return nums[m];
                } else if (nums[m - 1] < nums[m] && nums[m] > nums[m + 1]) {
                    return nums[m + 1];
                } else if (nums[m - 1] < nums[m] && nums[m] < nums[m + 1]) {
                    if (nums[m] < nums[r]) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
            }
        }
        return -1;
    }
}