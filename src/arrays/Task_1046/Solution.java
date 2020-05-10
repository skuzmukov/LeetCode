package arrays.Task_1046;

import java.util.Comparator;
import java.util.PriorityQueue;
//https://leetcode.com/problems/last-stone-weight
public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int stone : stones) {
            heap.add(stone);
        }
        int f;
        int s;
        while (heap.peek() != null) {
            f = heap.poll();
            if (heap.peek() != null) {
                s = heap.poll();
            } else {
                return f;
            }
            if (f != s) {
                heap.add(f - s);
            }
        }
        return 0;
    }
}