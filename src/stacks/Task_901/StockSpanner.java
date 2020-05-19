package stacks.Task_901;

import java.util.Stack;

public class StockSpanner {

    private Stack<int[]> stack = new Stack<>();
    public StockSpanner() { }

    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek()[1] <= price) {
            res += stack.pop()[0];
        }
        stack.push(new int[] {res, price});
        return res;
    }
}
