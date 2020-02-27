package arrays.Task_832;

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i ++) {
            int h = 0;
            int t = A[i].length - 1;
            while (h < t) {
                A[i][h] = A[i][h] + A[i][t];
                A[i][t] = A[i][h] - A[i][t];
                A[i][h] = A[i][h] - A[i][t];

                A[i][t] = (A[i][t] + 1) % 2;
                A[i][h] = (A[i][h] + 1) % 2;

                h ++;
                t --;
            }
            if (h == t) {
                A[i][t] = (A[i][t] + 1) % 2;
            }
        }
        return A;
    }
}