package arrays.Task_1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int counter = 0;
        int maxRow = 0;
        int j = 1;
        for (int i = grid.length - 1; i >= 0; i--) {
            j = grid[0].length - 1;
            while (j >= maxRow) {
                if (grid[i][j] >= 0) {
                    maxRow = j;
                    break;
                } else {
                    j --;
                    counter ++;
                }
            }
        }
        return counter;
    }
}