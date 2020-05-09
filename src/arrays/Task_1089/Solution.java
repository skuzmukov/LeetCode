package arrays.Task_1089;

import java.util.Arrays;

//https://leetcode.com/problems/duplicate-zeros/
public class Solution {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 0) {
                i++;
            } else {
                System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
                i += 2;
            }
        }
    }
}