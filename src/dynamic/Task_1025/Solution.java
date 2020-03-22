package dynamic.Task_1025;

public class Solution {
    public boolean divisorGame(int N) {
//        return  N % 2 == 0;
        if (N < 2) {
            return false;
        }
        boolean[] dp = new boolean[N + 1];
        dp[1] = false;
        dp[2] = true;
        for (int i = 3; i <= N; i++) {
            int sqr = (int) Math.sqrt(i) + 1;
            for (int j = 1; j < sqr; j++) {
                if (i % j == 0) {
                    dp[i] |= !dp[i - j];
                }
            }
        }
        return dp[N];
    }
}