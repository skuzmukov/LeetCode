package dynamic.Task_120;

import java.util.List;
//https://leetcode.com/discuss/general-discussion/458695/dynamic-programming-patterns
class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        if (t.size() == 1) {
            return t.get(0).get(0);
        }
        int[] dp = new int[t.size()];
        int i = 0;
        for (Integer v : t.get(t.size() - 1)) {
            dp[i++] = v;
        }
        int temp;
        for (i = t.size() - 2; i >= 0; i--) {
            for (int j = 0; j < t.get(i).size(); j++) {
                temp = t.get(i).get(j);
                dp[j] = Math.min(dp[j] + temp, dp[j + 1] + temp);
            }
        }
        return dp[0];
    }
}