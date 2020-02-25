package geometry.Task_1232;

public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        int x = coordinates[0][0];
        int y = coordinates[0][1];
        int k = 0;
        int b = 0;
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][0] != x) {
                k = (coordinates[i][1] - y) / (coordinates[i][0] - x);
                b = y - k * x;
                break;
            }
        }
        for (int i = 1; i < coordinates.length; i++) {
            if (coordinates[i][1] != (k * coordinates[i][0] + b)) {
                return false;
            }
        }
        return true;
    }
}