package math;

//https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers
public class Task_1317 {
    public int[] getNoZeroIntegers(int n) {
        String counter_1;
        String counter_2;
        for (int i = 1; i <= n; i++) {
            counter_1 = String.valueOf(i);
            counter_2 = String.valueOf(n - i);
            if (!counter_1.contains("0") && !counter_2.contains("0")) {
                return new int[] {i, n - i};
            }
        }
        return null;
    }
}