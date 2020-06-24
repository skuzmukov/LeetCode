package strings.Task_205;
//https://leetcode.com/problems/isomorphic-strings/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr = new int[256];
        boolean[] isContains = new boolean[256];
        int ind;
        for (int i = 0; i < s.length(); i++) {
            ind = s.charAt(i);
            if (arr[ind] == 0) {
                if (isContains[t.charAt(i)]) { return false; }
                isContains[t.charAt(i)] = true;
                arr[ind] = t.charAt(i);
            } else if (arr[ind] != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}