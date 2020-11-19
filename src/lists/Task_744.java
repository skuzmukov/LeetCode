package lists;

import java.util.Arrays;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Task_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = target - 'a';
        int ind;
        for (int i = start + 1; i < 26; i++) {
            ind = Arrays.binarySearch(letters, (char) (i + 'a'));
            if (ind >= 0) {
                return letters[ind];
            }
        }

        return letters[0];
    }
}