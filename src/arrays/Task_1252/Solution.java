package arrays.Task_1252;

public class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int counter = 0;
        int[][] res = new int[n][m];
        for (int i = 0; i < indices.length; i ++) {
            for (int x = 0; x < m; x ++) {
                res[indices[i][0]][x] ++;
            }
            for (int x = 0; x < n; x ++) {
                res[x][indices[i][1]] ++;
            }
        }
        for (int i = 0; i < res.length; i ++) {
            for (int j = 0; j < res[i].length; j++) {
                if (res[i][j] % 2 != 0) {
                    counter ++;
                }
            }
        }
        return counter;
    }
}
