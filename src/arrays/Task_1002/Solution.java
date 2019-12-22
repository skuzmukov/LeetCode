package arrays.Task_1002;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] A) {
        int[] res = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            res[A[0].charAt(i) - 'a'] ++;
        }
        for (int i = 1; i < A.length; i++) {
            int[] arr = new int[26];
            for (int j = 0; j < A[i].length(); j++) {
                arr[A[i].charAt(j) - 'a'] ++;
            }
            for (int x = 0; x < 26; x++) {
                res[x] = Math.min(res[x], arr[x]);
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (res[i] > 0) {
                while (res[i]-- > 0) {
                    list.add(String.valueOf((char)('a' + i)));
                }
            }
        }
        return list;
    }
}