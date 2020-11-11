package lists;

import java.util.Arrays;
//https://leetcode.com/problems/merge-intervals/
public class Task_56 {
    public int[][] merge(int[][] intervals) {

        if (intervals == null) { return null; }

        int[][] result = new int[intervals.length][2];
        int ind = 0;

        int l = intervals[0][0];
        int r = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (r >= intervals[i][0]) {
                r = Math.max(r, intervals[i][1]);
            } else {
                result[ind][0] = l;
                result[ind][1] = r;

                l = intervals[i][0];
                r = intervals[i][1];
            }
        }

        result[ind][0] = l;
        result[ind][1] = l;

        return Arrays.copyOf(result, ind + 1);
    }
}