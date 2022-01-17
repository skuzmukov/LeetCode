package dynamic.Task_264;

//https://leetcode.com/problems/ugly-number-ii/
class Solution {
    public int nthUglyNumber(int n) {
        int indFor2 = 0, indFor3 = 0, indFor5 = 0, ind = 1;
        int s2 = 2, s3 = 3, s5 = 5;
        int res = 0;
        int[] dp = new int[n];
        dp[0] = 1;
        while(n -- > 1) {
            res = Math.min(Math.min(s2 * dp[indFor2], s3 * dp[indFor3]), s5 * dp[indFor5]);
            dp[ind++] = res;
            if (res == s2 * dp[indFor2]) {
                indFor2++;
            }
            if (res == s3 * dp[indFor3]) {
                indFor3++;
            }
            if (res == s5 * dp[indFor5]) {
                indFor5++;
            }
        }
        return dp[dp.length - 1];
    }
}