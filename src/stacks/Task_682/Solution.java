package stacks.Task_682;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int calPoints(String[] ops) {
        int temp;
        int sum;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String s : ops) {
            if ("+".equals(s)) {
                temp = stack.pop();
                sum = temp + stack.peek();
                stack.push(temp);
                stack.push(sum);
            } else if ("D".equals(s)) {
                stack.push(stack.peek() * 2);
            } else if ("C".equals(s)) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(s));
            }
        }

        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}