package strings.Task_14;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minValue = Integer.MAX_VALUE;
        for (String s : strs) {
            minValue = minValue > s.length() ? s.length() : minValue;
        }
        char c;
        char[] res = new char[minValue];
        for (int i = 0; i < minValue; i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (c != strs[j].charAt(i)) {
                    return new String(Arrays.copyOfRange(res, 0, i));
                }
            }
            res[i] = c;
        }
        return new String(res);
    }
}