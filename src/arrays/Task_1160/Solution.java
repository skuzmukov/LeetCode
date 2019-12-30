package arrays.Task_1160;

import java.util.Arrays;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int[] arr = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            arr[chars.charAt(i) - 'a'] ++;
        }

        for (String word : words) {
            int[] clone = Arrays.copyOf(arr, arr.length);
            res += word.length();
            for (char c : word.toCharArray()) {
                if ((clone[c - 'a'] - 1) < 0) {
                    res -= word.length();
                    break;
                }
                clone[c - 'a']--;
            }
        }
        return res;
    }
}