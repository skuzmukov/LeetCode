package strings.Task_290;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/word-pattern/
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] splitted = str.split(" ");

        if (splitted.length != pattern.length()) {  return false; }

        Set<String> set = new HashSet<>();
        String[] abc = new String[32];

        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            if (abc[index] == null) {
                if (set.contains(splitted[i])) {
                    return false;
                }
                set.add(splitted[i]);
                abc[index] = splitted[i];
            } else {
                if (!splitted[i].equals(abc[index])) {
                    return false;
                }
            }
        }
        return true;
    }
}