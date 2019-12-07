package strings.Task_3;

import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] indexes = new int[128];
        Arrays.fill(indexes, -1);
        int start = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (indexes[s.charAt(i)] >= start) {
                start = indexes[s.charAt(i)] + 1;
            } else {
                count = Math.max(count, i - start + 1);
            }
            indexes[s.charAt(i)] = i;
        }

        return count;
    }
}
