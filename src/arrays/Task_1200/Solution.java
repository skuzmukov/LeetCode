package arrays.Task_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/minimum-absolute-difference/
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int diff;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff < min) {
                min = diff;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i - 1]) == min) {
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return res;
    }
}