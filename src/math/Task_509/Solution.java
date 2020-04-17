package math.Task_509;
//https://leetcode.com/problems/fibonacci-number/
public class Solution {
    public int fib(int N) {
        int prev = 1;
        int curr = 0;
        int temp = 0;
        while (N-- > 0) {
            temp = curr + prev;
            prev = curr;
            curr = temp;
        }
        return curr;
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 36 MB, less than 5.51% of Java online submissions for Fibonacci Number.
*/