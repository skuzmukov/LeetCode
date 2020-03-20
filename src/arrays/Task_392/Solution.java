package arrays.Task_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int index = -1;
        while (sIndex < s.length()) {
            index = t.indexOf(s.charAt(sIndex), index + 1);
            if (index == -1) { return false; }
            sIndex++;
        }
        return true;
    }
}
