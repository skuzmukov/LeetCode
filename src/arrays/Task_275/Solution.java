package arrays.Task_275;
//https://leetcode.com/problems/h-index-ii/
public class Solution {
    public int hIndex(int[] arr) {
        if (arr.length == 0) { return 0; }
        int h = 0;
        int t = arr.length - 1;
        int m = 0;
        while (h <= t) {
            m = (h + t) >>> 1;
            if (arr[m] == arr.length - m) { return arr.length - m;}
            else if (arr[m] >= arr.length - m) {
                t = m - 1;
            } else {
                h = m + 1;
            }
        }
        return arr.length - h;
    }
}