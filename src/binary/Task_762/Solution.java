package binary.Task_762;

import java.util.Arrays;
//https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
public class Solution {
    public int countPrimeSetBits(int L, int R) {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        int res = 0;
        int curr;
        for (int i = L; i <= R; i++) {
            if (Arrays.binarySearch(primes, Integer.bitCount(i)) >= 0) { res ++; }
        }
        return res;
    }
}

/*
Runtime: 5 ms, faster than 78.60% of Java online submissions for Prime Number of Set Bits in Binary Representation.
Memory Usage: 35.9 MB, less than 7.14% of Java online submissions for Prime Number of Set Bits in Binary Representation.
*/