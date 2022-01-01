package dynamic.Task_931;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        System.arraycopy(matrix[0], 0, dp[0], 0, n);
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    dp[i][j] = Math.min(dp[i - 1][j] + matrix[i][j], dp[i - 1][j + 1] + matrix[i][j]);
                } else if (j == n - 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + matrix[i][j], dp[i - 1][j] + matrix[i][j]);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + matrix[i][j], Math.min(dp[i - 1][j] + matrix[i][j], dp[i - 1][j + 1] + matrix[i][j]));
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i : dp[dp.length - 1]) {
            res = Math.min(i, res);
        }

        return res;
    }
}