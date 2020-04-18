package arrays.Task_1380;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix
public class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int curr;
        int min;
        boolean isMax;
        for (int i = 0; i < matrix.length; i++) {
            min = 0;
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][min] > matrix[i][j]) {
                    min = j;
                }
            }
            curr = matrix[i][min];
            isMax = true;
            for (int m = 0; m < matrix.length; m++) {
                if (matrix[m][min] > curr) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) { res.add(curr); }
        }
        return res;
    }
}


/*
Runtime: 1 ms, faster than 98.28% of Java online submissions for Lucky Numbers in a Matrix.
Memory Usage: 40.1 MB, less than 100.00% of Java online submissions for Lucky Numbers in a Matrix.
*/