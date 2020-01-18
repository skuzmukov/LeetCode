package arrays.Task_763;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[26];
        for (int i = 0; i < S.length(); i++) {
            arr[S.charAt(i) - 'a'] = i;
        }
        int start = 0;
        int max = 0;
        for (int i = 0; i < S.length(); i++) {
            max = Math.max(max, arr[S.charAt(i) - 'a']);
            if (max == i) {
                res.add(max - start + 1);
                start = i + 1;
                max = i + 1;
            }
        }

        return res;
    }
}