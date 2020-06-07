package dynamic.Task_322;

import java.util.Arrays;
//https://leetcode.com/problems/coin-change/
public class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                } else { break; }
            }
        }
        return dp[dp.length - 1] != amount + 1 ? dp[dp.length - 1] : -1;
    }
}