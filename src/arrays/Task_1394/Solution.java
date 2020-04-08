package arrays.Task_1394;

public class Solution {
    public int findLucky(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) { max = i; }
            if (i < min) { min = i; }
        }
        int[] freq = new int[max - min + 1];
        for (int i : arr) {
            freq[i - min] ++;
        }
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] == i + min) {
                return freq[i];
            }
        }
        return -1;
    }
}
