package strings.Task_438;

import java.util.*;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) { return res; }
        char[] pArr = new char[27];
        char[] sArr = new char[27];
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a'] ++;
            sArr[s.charAt(i) - 'a'] ++;
        }
        for (int i = p.length(); i < s.length(); i++) {
            if (Arrays.equals(pArr, sArr)) { res.add(i - p.length()); }
            sArr[s.charAt(i - p.length()) - 'a'] --; // NB!
            sArr[s.charAt(i) - 'a'] ++;
        }
        if (Arrays.equals(pArr, sArr)) { res.add(s.length() - p.length()); }
        return res;
    }
}

// sliding window/ created with help