package strings.Task_402;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/remove-k-digits/
public class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) { return "0"; }
        char [] stack = new char[num.length()];
        int count = 0;
        int ind = 0;
        for (char c : num.toCharArray()) {
            while (ind > 0 && count < k && (int) stack[ind - 1] > c) {
                ind --;
                count++;
            }
            stack[ind++] = c;
        }
        while (count < k) {
            ind --;
            count ++;
        }
        int i = 0;
        while (i < ind - 1 && stack[i] == '0') { i ++; }
        return String.valueOf(stack, i, ind - i);
    }
}