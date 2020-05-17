package strings.Task_438;

import java.util.*;
//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] pArr = new char[27];
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a'] ++;
        }
        Set<Integer> res = new HashSet<>();
        for (int pInd = 0; pInd < p.length(); pInd++) {
            for (int i = 0; i < s.length() - p.length() + 1; i++) {
                if (p.charAt(pInd) == s.charAt(i)) {
                    char[] sArr = new char[27];
                    for (int x = i; x < i + p.length(); x++) {
                        sArr[s.charAt(x) - 'a'] ++;
                    }
                    if (Arrays.equals(sArr, pArr)) {
                        res.add(i);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
// TLE 33/36 accepted