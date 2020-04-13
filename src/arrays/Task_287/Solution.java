package arrays.Task_287;
//https://leetcode.com/problems/find-the-duplicate-number/
class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (int i : nums) {
            freq[i] ++;
            if (freq[i] > 1) { return i; }
        }
        return -1;
    }
}

/*Runtime: 0 ms, faster than 100.00% of Java online submissions for Find the Duplicate Number.
Memory Usage: 39.2 MB, less than 5.09% of Java online submissions for Find the Duplicate Number.*/