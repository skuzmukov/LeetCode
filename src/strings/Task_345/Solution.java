package strings.Task_345;

import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/reverse-vowels-of-a-string/
public class Solution {
    public String reverseVowels(String s) {
        List<Character> chars = Arrays.asList('a', 'o', 'i', 'e', 'u', 'A', 'O', 'I', 'E', 'U');
        char[] arr = s.toCharArray();
        int h = 0;
        int t = arr.length - 1;
        char c;
        while (h < t) {
            while (h < t && !chars.contains(arr[h])) { h++; }
            while (h < t && !chars.contains(arr[t])) { t--; }
            c = arr[h];
            arr[h] = arr[t];
            arr[t] = c;
            h ++;
            t --;
        }
        return String.valueOf(arr);
    }
}