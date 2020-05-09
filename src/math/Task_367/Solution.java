package math.Task_367;
//https://leetcode.com/problems/valid-perfect-square/
public class Solution {
    public boolean isPerfectSquare(int num) {
        return Math.sqrt(num) % 1 == 0;
    }
}