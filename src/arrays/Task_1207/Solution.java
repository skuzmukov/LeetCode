package arrays.Task_1207;
//https://leetcode.com/problems/unique-number-of-occurrences/
public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int i : arr) {
            freq[i + 1000] ++;
        }
        int[] uniq = new int[1001];
        for (int f : freq) {
            if (uniq[f] > 0) { return false; }
            uniq[f] = f;
        }
        return true;
    }
}