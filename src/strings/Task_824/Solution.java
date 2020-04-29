package strings.Task_824;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String toGoatLatin(String S) {
        int i = 0;
        int counter = 0;
        char first;
        Set<Character> vowel = new HashSet<Character>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');

        StringBuilder sb = new StringBuilder();
        while (i < S.length()) {
            while (S.charAt(i) == ' ') { i ++; }
            counter++;
            first = S.charAt(i);
            if (vowel.contains(first)) {
                while (i < S.length() && S.charAt(i) != ' ') {
                    sb.append(S.charAt(i++));
                }
            } else {
                i ++;
                while (i < S.length() && S.charAt(i) != ' ') {
                    sb.append(S.charAt(i++));
                }
                sb.append(first);
            }
            sb.append("ma");
            for (int j = 0; j < counter; j++) {
                sb.append('a');
            }
            if (i < S.length()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}