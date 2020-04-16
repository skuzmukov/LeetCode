package strings.Task_1347;
//https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
public class Solution {
    public int minSteps(String s, String t) {
        int[] sChars = new int[26];
        int[] tChars = new int[26];
        for (char c : s.toCharArray()) {
            sChars[c - 'a'] ++;
        }
        for (char c : t.toCharArray()) {
            tChars[c - 'a'] ++;
        }
        int res = 0;
        for (int i = 0; i < tChars.length; i++) {
            if (tChars[i] > 0 && tChars[i] > sChars[i]) {
                res += tChars[i] - sChars[i];
            }
        }

        return res;

    }
    /*
        public int minSteps(String s, String t) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a'] --;
            chars[t.charAt(i) - 'a'] ++;
        }
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                res += chars[i];
            }
        }
        return res;
    }
    */
}

/*
Runtime: 9 ms, faster than 90.39% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram.
Memory Usage: 40.3 MB, less than 100.00% of Java online submissions for Minimum Number of Steps to Make Two Strings Anagram.
*/


