package arrays;

import java.util.Deque;
import java.util.LinkedList;

public class Task_55 {
    public boolean canJump(int[] nums) {
        boolean[] isVisited = new boolean[nums.length + 1];
        int steps;
        int pos = nums.length - 1;
        int length = nums.length;
        int ind;

        Deque<Integer> deque = new LinkedList<>();
        deque.addLast(0);
        while (!deque.isEmpty()) {
            ind = deque.removeFirst();
            steps = nums[ind];
            for (int step = steps + ind; step >= ind + 1; step--) {
                if (step == length) {
                    return true;
                }
                if (!isVisited[step]) {
                    isVisited[step] = true;
                    deque.addLast(step);
                }
                if (step == pos) {
                    return true;
                }
            }
        }
        return nums.length == 1;
    }
}


/*
*
* Наивная реализация
* Проходим по всем элементам, проверяем, можно ли дойти из текущего элемента до последнего
* 
* */