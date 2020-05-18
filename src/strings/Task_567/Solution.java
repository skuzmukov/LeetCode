package strings.Task_567;

import java.util.Arrays;
//https://leetcode.com/problems/permutation-in-string/
public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int fLen = s1.length();
        int sLen = s2.length();
        if (fLen > sLen) { return  false; }
        char[] fArr = new char[27];
        char[] sArr = new char[27];
        for (int i = 0; i < fLen; i++) {
            fArr[s1.charAt(i) - 'a'] ++;
            sArr[s2.charAt(i) - 'a'] ++;
        }
        for (int i = fLen; i < sLen; i++) {
            if (Arrays.equals(fArr, sArr)) { return true; }
            sArr[s2.charAt(i - fLen) - 'a'] --;
            sArr[s2.charAt(i) - 'a'] ++;
        }
        return Arrays.equals(fArr, sArr);
    }
}