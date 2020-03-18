package stacks.Task_844;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Deque<Character> sDeque = new ArrayDeque<>(S.length());
        Deque<Character> tDeque = new ArrayDeque<>(T.length());
        for (char c : S.toCharArray()) {
            if (c == '#') {
                sDeque.pollFirst();
            } else {
                sDeque.push(c);
            }
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                tDeque.pollFirst();
            } else {
                tDeque.push(c);
            }
        }
        while (!sDeque.isEmpty()) {
            if (sDeque.pollFirst() != tDeque.pollFirst()) {
                return false;
            }
        }
        return true;
    }
}
