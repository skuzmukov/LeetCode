package arrays.Task_1304;

public class Solution {
    public int[] sumZero(int n) {
        int i = 0;
        int val = -1 * (n / 2);
        int[] arr = new int[n];
        while (i < n) {
            if (val == 0 && n % 2 == 0) {
                val++;
                continue;
            }
            arr[i++] = val++;
        }
        return arr;
    }
}