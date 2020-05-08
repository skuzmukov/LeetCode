package geometry.Task_1232;
//https://leetcode.com/problems/check-if-it-is-a-straight-line
public class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates[1][0] - coordinates[0][0] == 0) { return false; }
        int k = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        int b = coordinates[0][1] - k * coordinates[0][0];
        for (int i = 2; i < coordinates.length; i++) {
            if (coordinates[i][1] != k * coordinates[i][0] + b) {
                return false;
            }
        }
        return true;
    }
}