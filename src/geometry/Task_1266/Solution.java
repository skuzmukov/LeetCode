package geometry.Task_1266;

public class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int times = 0;
        int x;
        int y;
        for (int i = 0; i < points.length - 1; i++) {
            x = Math.abs(points[i][0] - points[i + 1][0]);
            y = Math.abs(points[i][1] - points[i + 1][1]);
            times += x >= y ? x : y;
        }
        return times;
    }
}