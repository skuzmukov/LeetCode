package arrays.Task_1356;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
//https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
public class Solution {
    public int[] sortByBits(int[] arr) {
        List<PriorityQueue<Integer>> res = new ArrayList<PriorityQueue<Integer>>(33);
        for (int i = 0; i < 33; i++) {
            res.add(new PriorityQueue<Integer>());
        }
        for (int i : arr) {
            res.get(Integer.bitCount(i)).add(i);
        }

        int[] result = new int[arr.length];
        int ind = 0;
        for (PriorityQueue<Integer> queue : res) {
            while(!queue.isEmpty()) {result[ind++] = queue.poll(); }
        }
        return result;
    }
}