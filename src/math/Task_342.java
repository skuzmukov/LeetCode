package math;
//https://leetcode.com/problems/power-of-four/
public class Task_342 {
    public boolean isPowerOfFour(int i) {
        return Integer.bitCount(i) == 1 && Integer.numberOfLeadingZeros(i) % 2 == 1 && Integer.numberOfTrailingZeros(i) % 2 == 0;
    }
}