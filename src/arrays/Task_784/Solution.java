package arrays.Task_784;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//https://leetcode.com/problems/letter-case-permutation
public class Solution {
    public List<String> letterCasePermutation(String S) {
        String s = S.toLowerCase();
        Set<String> res = new HashSet<String>();
        res.add(s);
        int len = S.length();
        int h = (int) Math.pow(2, len) + 1;
        int t = (int) Math.pow(2, len + 1);
        StringBuilder sb = new StringBuilder();
        String mask;
        for (int num = h; num < t; num++) {
            mask = Integer.toBinaryString(num);
            for (int i = 1; i < mask.length(); i++) {
                if (mask.charAt(i) == '1') {
                    sb.append(Character.toUpperCase(S.charAt(i - 1)));
                } else {
                    sb.append(Character.toLowerCase(S.charAt(i - 1)));
                }
            }
            sb.setLength(0);
        }
        return new ArrayList<>(res);
    }
}