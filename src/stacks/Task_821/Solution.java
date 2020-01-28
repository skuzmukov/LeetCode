package stacks.Task_821;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];
        Deque<Integer> stack = new ArrayDeque<>(S.length());
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                while (!stack.isEmpty()) {
                    int ind = stack.pop();
                    res[ind] = i - ind;
                }
            } else {
                stack.push(i);
            }
        }
        while (!stack.isEmpty()) {
            res[stack.pop()] = Integer.MAX_VALUE;
        }
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                while (!stack.isEmpty()) {
                    int ind = stack.pop();
                    res[ind] = Math.min(ind - i, res[ind]);

                }
            } else {
                stack.push(i);
            }
        }
        return res;
    }
}