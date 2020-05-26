package strings.Task_1047;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
public class Solution {
    public String removeDuplicates(String S) {
        char[] chars = new char[S.length()]; // array instead of stack
        int i = 0;
        for (char c : S.toCharArray()) {
            if (i == 0 || chars[i - 1] != c) {
                chars[i ++] = c;
            } else {
                i --;
            }
        }
        return String.valueOf(chars, 0, i);
    }
}