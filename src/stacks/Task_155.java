package stacks;

import java.util.Comparator;
import java.util.PriorityQueue;
//https://leetcode.com/problems/min-stack/
public class Task_155 {
}

class MinStack {

    private int index = 0;
    private int[] stack;
    private final PriorityQueue<Integer> queue;

    public MinStack() {
        stack = new int[10];
        queue = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue));
    }

    public void push(int x) {
        if (index == stack.length) {
            int[] arr = new int[stack.length * 2];
            System.arraycopy(stack, 0, arr, 0, stack.length);
            stack = arr;
        }
        stack[index++] = x;
        queue.add(x);

    }

    public void pop() {
        int x = stack[--index];
        queue.remove(x);
    }

    public int top() {
        return stack[index - 1];
    }

    public int getMin() {
        return queue.peek();
    }
}