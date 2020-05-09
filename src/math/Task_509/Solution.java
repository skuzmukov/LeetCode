package math.Task_509;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/fibonacci-number/
public class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int fib(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }
        if (N < 2) {
            return N;
        }
        int n = fib(N - 1) + fib(N - 2);
        cache.put(N, n);

        return n;
    }
}