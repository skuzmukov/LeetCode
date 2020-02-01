package arrays.Task_1137;

public class Solution {
    public int tribonacci(int n) {
        if (n < 2) { return n; }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[arr.length - 1];
    }
}