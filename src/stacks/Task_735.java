package stacks;

import java.util.Deque;
import java.util.LinkedList;
//https://leetcode.com/problems/asteroid-collision/
public class Task_735 {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new LinkedList<>();
        boolean flag = false;
        for (int ast : asteroids) {
            if (deque.isEmpty()) {
                deque.addLast(ast);
                continue;
            }

            if ((deque.peekLast() < 0 && ast > 0) || (deque.peekLast() > 0 && ast > 0) || (deque.peekLast() < 0 && ast < 0)) {
                deque.addLast(ast);
            }

            while (!deque.isEmpty() && deque.peekLast() > 0 && ast < 0) {
                int sum = deque.peekLast() + ast;
                if (sum == 0) {
                    deque.pollLast();
                    flag = false;
                    break;
                } else if (sum < 0) {
                    deque.pollLast();
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                deque.addLast(ast);
                flag = false;
            }
        }

        int[] res = new int[deque.size()];
        int i = 0;
        while (!deque.isEmpty()) {
            res[i++] = deque.pollFirst();
        }
        return res;
    }
}