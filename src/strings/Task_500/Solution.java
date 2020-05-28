package strings.Task_500;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/keyboard-row/
public class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        int[] hash = new int[126];
        hash['Q'] = 1; hash['q'] = 1;
        hash['W'] = 1; hash['w'] = 1;
        hash['E'] = 1; hash['e'] = 1;
        hash['R'] = 1; hash['r'] = 1;
        hash['T'] = 1; hash['t'] = 1;
        hash['Y'] = 1; hash['y'] = 1;
        hash['U'] = 1; hash['u'] = 1;
        hash['I'] = 1; hash['i'] = 1;
        hash['O'] = 1; hash['o'] = 1;
        hash['P'] = 1; hash['p'] = 1;
        hash['A'] = 2; hash['a'] = 2;
        hash['S'] = 2; hash['s'] = 2;
        hash['D'] = 2; hash['d'] = 2;
        hash['F'] = 2; hash['f'] = 2;
        hash['G'] = 2; hash['g'] = 2;
        hash['H'] = 2; hash['h'] = 2;
        hash['J'] = 2; hash['j'] = 2;
        hash['K'] = 2; hash['k'] = 2;
        hash['L'] = 2; hash['l'] = 2;
        hash['Z'] = 3; hash['z'] = 3;
        hash['X'] = 3; hash['x'] = 3;
        hash['C'] = 3; hash['c'] = 3;
        hash['V'] = 3; hash['v'] = 3;
        hash['B'] = 3; hash['b'] = 3;
        hash['N'] = 3; hash['n'] = 3;
        hash['M'] = 3; hash['m'] = 3;

        int curr;
        boolean f = true;
        for (String word : words) {
            curr = hash[word.charAt(0)];
            for (int i = 1; i < word.length(); i++) {
                if (curr != hash[word.charAt(i)]) {
                    f = false;
                    break;
                }
            }
            if (f) {
                res.add(word);
            }
            f = true;
        }
        return res.toArray(new String[0]);
    }
}