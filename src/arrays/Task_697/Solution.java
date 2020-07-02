package arrays.Task_697;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] freq = new int[50_000];
        int[] first = new int[50_000];
        int[] last = new int[50_000];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]] ++;
            if (first[nums[i]] == 0) { first[nums[i]] = i + 1; }
            last[nums[i]] = i + 1;
        }
        int max = 1;
        int curr;
        int maxLen = 1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1 && freq[i] >= max) {
                curr = last[i] - first[i] + 1;
                if (freq[i] > max || curr < maxLen) {
                    max = freq[i];
                    maxLen = curr;
                }
            }
        }
        return maxLen;
    }
}
