package arrays.Task_1338;

import java.util.Collections;
import java.util.PriorityQueue;

//https://leetcode.com/problems/reduce-array-size-to-the-half/
public class Solution {
    public int minSetSize(int[] arr) {
        int[] freq = new int[100_001];
        for (int i : arr) {
            freq[i] ++;
        }
        int N = arr.length / 2;
        int res = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i : freq) {
            if (i > 0) {
                heap.add(i);
            }
        }
        while (N > 0) {
            N -= heap.remove();
            res++;
        }
        return res;
    }
}