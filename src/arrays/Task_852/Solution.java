package arrays.Task_852;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int h = 0;
        int t = A.length - 1;
        int m;
        while (h <= t) {
            m = (h + t) >>> 1;
            if (A[m - 1] < A[m] && A[m + 1] < A[m]) { return m; }
            if (A[m - 1] < A[m] && A[m] < A[m + 1]) {
                h = m + 1;
            } else {
                t = m - 1;
            }
        }
        return -1;
    }
}