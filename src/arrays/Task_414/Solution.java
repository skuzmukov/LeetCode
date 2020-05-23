package arrays.Task_414;

import java.util.TreeSet;
//https://leetcode.com/problems/third-maximum-number/
public class Solution {
    public int thirdMax(int[] nums) {
        assert nums.length > 1;
        TreeSet<Integer> set = new TreeSet<>(); // like Set and PriorityQueue
        for (int i : nums) {
            set.add(i);
            if (set.size() > 3) {
                set.pollFirst();
            }
        }
        return set.size() < 3 ? set.pollLast() : set.pollFirst();
    }
}