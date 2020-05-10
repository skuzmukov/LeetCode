package arrays.Task_703;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-a-stream/
public class KthLargest {
    int size;
    PriorityQueue<Integer> heap = new PriorityQueue<>();

    public KthLargest(int k, int[] nums) {
        size = k;
        for (int i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        if (heap.size() < size) {
            heap.add(val);
        } else if (heap.peek() < val) {
            heap.poll();
            heap.add(val);
        }
        return heap.peek();
    }
}