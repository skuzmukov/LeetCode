package arrays.Task_347;

import java.util.*;
//
public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(nums.length);
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(nums.length, (o1, o2) -> o2.getValue() - o1.getValue());
        heap.addAll(freq.entrySet());
        int[] arr = new int[nums.length];
        int i = 0;
        while (k -- > 0) { arr[i++] = heap.poll().getKey(); }
        return Arrays.copyOfRange(arr, 0, i);
    }
}