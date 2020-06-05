package arrays.Task_594;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-harmonious-subsequence/
public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>(nums.length);
        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        Integer next;
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            next = hash.get(entry.getKey() + 1);
            if (next != null) {
                res = Math.max(res, hash.get(entry.getKey()) + next);
            }
        }
        return res;
    }
}