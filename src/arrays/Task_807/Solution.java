package arrays.Task_807;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int increase = 0;
        int[] fromLeftToRight = new int[grid.length];
        int[] fromTopToButton = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                fromLeftToRight[j] = Math.max(fromLeftToRight[j], grid[i][j]);
                fromTopToButton[i] = Math.max(fromTopToButton[i] , grid[i][j]);
            }
        }
        int temp;
        int inc;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                temp = Math.min(fromTopToButton[i], fromLeftToRight[j]);
                inc = temp - grid[i][j];
                if (inc > 0) {
                    increase += inc;
                }
            }
        }
        return increase;
    }
}
