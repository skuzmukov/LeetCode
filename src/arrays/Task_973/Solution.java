package arrays.Task_973;

import java.util.Comparator;
import java.util.PriorityQueue;
//https://leetcode.com/problems/k-closest-points-to-origin
public class Solution {
    public int[][] kClosest(int[][] points, int K) {
        if (points.length <= K) { return points; }
        int[] distances = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            distances[i] = points[i][1] * points[i][1] + points[i][0] * points[i][0];
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.comparingInt(o -> distances[o]));
        for (int i = 0; i < points.length; i++) {
            queue.add(i);
        }
        int[][] res = new int[K][2];
        int i = 0;
        int ind;
        while (!queue.isEmpty() && i < K) {
            ind = queue.poll();
            res[i++] = new int[]{points[ind][0], points[ind][1]};
        }
        return res;
    }
}