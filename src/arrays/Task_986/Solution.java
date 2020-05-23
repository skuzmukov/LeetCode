package arrays.Task_986;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/interval-list-intersections
public class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        int h;
        int t;
        while (a < A.length && b < B.length) {
            h = Math.max(A[a][0], B[b][0]);
            t = Math.min(A[a][1], B[b][1]);
            if (h <= t) { list.add(new int[] {h, t}); }
            if (t == A[a][1]) {
                a ++ ;
            } else {
                b ++ ;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}

// created with help // 