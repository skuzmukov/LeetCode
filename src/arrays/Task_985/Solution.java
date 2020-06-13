package arrays.Task_985;
//https://leetcode.com/problems/sum-of-even-numbers-after-queries/
public class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];
        int val = 0;
        for (int a : A) {
            if (a % 2 == 0) {
                val += a;
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (A[queries[i][1]] % 2 == 0) { val -= A[queries[i][1]]; }
            A[queries[i][1]] += queries[i][0];
            if (A[queries[i][1]] % 2 == 0) { val += A[queries[i][1]]; }
            res[i] = val;
        }

        return res;
    }
}