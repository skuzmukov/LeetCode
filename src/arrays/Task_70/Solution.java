package arrays.Task_70;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/climbing-stairs/
public class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        if (n < 3) { return n; }
        int res = climbStairs(n - 1) + climbStairs(n - 2);
        cache.put(n, res);

        return res;
    }
}