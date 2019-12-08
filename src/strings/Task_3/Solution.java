package strings.Task_3;

import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexes = new int[128];
        Arrays.fill(indexes, -1);
        int start = 0;
        int index = 0;
        int count = 0;
        for (index = 0; index < s.length(); index++) {
            if (indexes[s.charAt(index)] >= start) {
                count = Math.max(count, index - start);
                start = indexes[s.charAt(index)] + 1;
            }
            indexes[s.charAt(index)] = index;
        }
        return Math.max(count, index - start);
    }
}