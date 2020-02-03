package arrays.Task_1288;

import java.util.Arrays;

public class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> y[1] - x[1] == 0 ? x[0] - y[0] : y[1] - x[1]);
        int count = 0;
        int interval = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (interval <= intervals[i][0]) {
                count++;
            } else {
                interval = intervals[i][0];
            }
        }
        return intervals.length - count;
    }
}