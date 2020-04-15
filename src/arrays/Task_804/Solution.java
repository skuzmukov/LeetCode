package arrays.Task_804;

import java.util.HashSet;
import java.util.Set;
//https://leetcode.com/problems/unique-morse-code-words/
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        StringBuilder sb = new StringBuilder();
        String[] abc = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
                "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> res = new HashSet<String>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                sb.append(abc[c - 'a']);
            }
            res.add(sb.toString());
            sb.setLength(0);
        }
        return res.size();
    }
}

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Unique Morse Code Words.
Memory Usage: 37.4 MB, less than 5.26% of Java online submissions for Unique Morse Code Words.
*/