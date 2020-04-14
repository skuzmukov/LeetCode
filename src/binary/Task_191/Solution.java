package binary.Task_191;

//https://leetcode.com/problems/number-of-1-bits/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of 1 Bits.
Memory Usage: 36.3 MB, less than 5.41% of Java online submissions for Number of 1 Bits.
*/