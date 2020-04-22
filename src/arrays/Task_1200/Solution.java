package arrays.Task_1200;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/minimum-absolute-difference/
public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int[] sorted = new int[2_000_001];
        List<List<Integer>> res = new ArrayList<>();
        for (int i : arr) {
            sorted[i + 1_000_000]++;
        }
        int i = 0;
        while(sorted[i] == 0) { i ++; }
        int prev = i++;
        while(sorted[i] == 0) { i ++; }

        int diff = i - prev;
        prev = i;
        for (int ind = i + 1; ind < sorted.length; ind++) {
            if (sorted[ind] > 0) {
                if (ind - prev < diff) {
                    diff = ind - prev;
                }
                prev = ind;
            }
        }
        for (int num = 0; num < sorted.length - diff; num++) {
            if (sorted[num] > 0 && sorted[num + diff] > 0) {
                List<Integer> list = new ArrayList<>();
                list.add(num - 1_000_000);
                list.add(num - 1_000_000 + diff);
                res.add(list);
            }
        }
        return res;
    }
}
/*
Runtime: 187 ms, faster than 5.26% of Java online submissions for Minimum Absolute Difference.
Memory Usage: 57.4 MB, less than 100.00% of Java online submissions for Minimum Absolute Difference.
*/