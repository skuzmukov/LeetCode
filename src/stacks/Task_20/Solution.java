package stacks.Task_20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == ' ') {
                index++;
                continue;
            }
            if ('[' == s.charAt(index) || '{' == s.charAt(index) || '(' == s.charAt(index)) {
                stack.push(s.charAt(index));
            } else if (stack.size() != 0
                    && (']' == s.charAt(index) && stack.peek() == '['
                    ||  '}' == s.charAt(index) && stack.peek() == '{'
                    ||  ')' == s.charAt(index) && stack.peek() == '(')) {
                stack.pop();
            } else {
                return false;
            }
            index++;
        }
        return stack.empty();
    }
}