package arrays.Task_646;

import java.util.Arrays;

public class Solution {
    public int findLongestChain(int[][] pairs) {
        int count = 1;
        Arrays.sort(pairs, (x, y) -> x[1] - y[1]);
        int max = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (max < pairs[i][0]) {
                max = pairs[i][1];
                count ++;
            }
        }
        return count;
    }
}