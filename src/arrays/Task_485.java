package arrays;

//https://leetcode.com/problems/max-consecutive-ones/
public class Task_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i : nums) {
            if (i == 1) {
                count ++;
            } else if (count > 0) {
                max = Math.max(count, max);
                count = 0;
            }
        }

        return Math.max(max, count);
    }
}


/*
*
Input: [1,1,0,1,1,1]
Output: 3
* Проходим по массиву, если текущий элемент = 1
*   записываем в count + 1
* Иначе, если count > 0 считаем max, обнуляем count
*
* Возвращаем наибольший элемент из max и count - на такой случай [1, 0, 1, 1, 1]
* */