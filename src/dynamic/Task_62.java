package dynamic;
//https://leetcode.com/problems/unique-paths/
public class Task_62 {
    public int uniquePaths(int n, int m) {
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }
        for (int j = 0; j < m; j++) {
            arr[0][j] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        return arr[n - 1][m - 1];
    }
}