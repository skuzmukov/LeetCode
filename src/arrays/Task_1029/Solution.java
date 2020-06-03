package arrays.Task_1029;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        int res = 0;
        Arrays.sort(costs, Comparator.comparingInt(arr -> arr[0] - arr[1]));
        for (int i = 0; i < n; i++) {
            res += costs[i][0];
        }
        for (int i = n; i < costs.length; i++) {
            res += costs[i][1];
        }
        return res;
    }
}