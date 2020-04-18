package strings.Task_942;
//https://leetcode.com/problems/di-string-match/
public class Solution {
    public int[] diStringMatch(String S) {
        int I = 0;
        int len = S.length();
        int D = len;
        int[] res = new int[len + 1];
        int i = 0;
        for (char c : S.toCharArray()) {
            res[i++] = c == 'D' ? D-- : I++;
        }
        res[len] = I;
        return res;
    }
}
/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for DI String Match.
Memory Usage: 40.9 MB, less than 6.82% of Java online submissions for DI String Match.
*/