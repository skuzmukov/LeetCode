package arrays.Task_1337;

import java.util.Arrays;
import java.util.Comparator;
//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/submissions/
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res = new int[mat.length][2];
        int ind = 0;
        for (int i = 0; i < mat.length; i++) {
            res[ind++] = new int[] {i, binarySearch(mat[i])};
        }
        Arrays.sort(res, Comparator.comparingInt(value -> value[1]));
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = res[i][0];
        }
        return arr;
    }

    private int binarySearch(int[] arr) {
        int h = 0;
        int t = arr.length - 1;
        int m;
        while (h <= t) {
            m = (h + t) / 2;
            if (arr[m] == 0 && (m == 0 || arr[m - 1] == 1)) {
                return m;
            } else if (arr[m] == 1) {
                h = m + 1;
            } else {
                t = m - 1;
            }
        }
        return h;
    }
}