package arrays.Task_633;
//https://leetcode.com/problems/sum-of-square-numbers/
public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) { return true; } // is 4 times faster then b % 1 == 0
        }
        return false;
    }
}