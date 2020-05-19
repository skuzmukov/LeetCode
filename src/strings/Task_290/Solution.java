package strings.Task_290;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/word-pattern/
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (arr.length != pattern.length()) { return false; }
        String[] hash = new String[27];
        Set<String> set = new HashSet<>(arr.length); // NB check if string already was on the str
        String curr;
        for (int i = 0; i < arr.length; i++) {
            curr = hash[pattern.charAt(i) - 'a'];
            if (curr == null) {
                if (set.contains(arr[i])) { return false; }
                set.add(arr[i]);
                hash[pattern.charAt(i) - 'a'] = arr[i];
            } else if (!curr.equals(arr[i])) {
                return false;
            }
        }
        return true;
    }
}