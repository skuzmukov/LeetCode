package strings.Task_345;

import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class Solution {
    public String reverseVowels(String s) {
        boolean[] chars = new boolean[128];
        char[] vowels = {'a', 'o', 'i', 'e', 'u', 'A', 'O', 'I', 'E', 'U'};
        for (char vowel : vowels) {
            chars[vowel] = true;
        }
        char[] arr = s.toCharArray();
        int h = 0;
        int t = arr.length - 1;
        char c;
        while (h < t) {
            while (h < t && !chars[arr[h]]) { h++; }
            while (h < t && !chars[arr[t]]) { t--; }
            c = arr[h];
            arr[h] = arr[t];
            arr[t] = c;
            h ++;
            t --;
        }
        return String.valueOf(arr);
    }
}