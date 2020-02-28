package arrays.Task_977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int x = 0;
        for (int i : A) {
            res[x++] = i * i;
        }
        Arrays.sort(res);
        return res;
    }
}