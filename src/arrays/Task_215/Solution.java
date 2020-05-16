package arrays.Task_215;

import java.util.Comparator;
import java.util.PriorityQueue;
//https://leetcode.com/problems/kth-largest-element-in-an-array
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > queue.peek()) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        return queue.poll();
    }
}