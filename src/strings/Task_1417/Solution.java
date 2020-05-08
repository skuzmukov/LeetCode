package strings.Task_1417;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/reformat-the-string/
public class Solution {
    public String reformat(String s) {
        List<Character> digits = new ArrayList<Character>();
        List<Character> characters = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            if (((int) c) < 58) {
                digits.add(c);
            } else {
                characters.add(c);
            }
        }
        if (digits.size() == characters.size() || digits.size() == characters.size() + 1 || digits.size() + 1 == characters.size()) {
            StringBuilder sb = new StringBuilder();
            if (digits.size() + 1 == characters.size()) {
                sb.append(characters.get(0));
                for (int i = 0; i < digits.size(); i++) {
                    sb.append(digits.get(i));
                    sb.append(characters.get(i + 1));
                }
            } else if (digits.size() == characters.size() + 1) {
                sb.append(digits.get(0));
                for (int i = 0; i < characters.size(); i++) {
                    sb.append(characters.get(i));
                    sb.append(digits.get(i + 1));
                }
            } else {
                for (int i = 0; i < characters.size(); i++) {
                    sb.append(characters.get(i));
                    sb.append(digits.get(i));
                }
            }
            return sb.toString();
        }
        return "";
    }
}