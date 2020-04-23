package arrays.Task_1122;
//https://leetcode.com/problems/relative-sort-array/
public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] sorted = new int[1001];
        for (int i : arr1) {
            sorted[i] ++;
        }
        int[] arr = new int[arr1.length];
        int ind = 0;
        for (int num : arr2) {
            while (sorted[num] -- > 0) {
                arr[ind++] = num;
            }
        }
        for (int i = 0; i < sorted.length; i++) {
            while (sorted[i] -- > 0) {
                arr[ind++] = i;
            }
        }
        return arr;
    }
}