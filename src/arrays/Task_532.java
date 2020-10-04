package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/k-diff-pairs-in-an-array/
public class Task_532 {
    public int findPairs(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        int ind;
        int tail = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                ind = Arrays.binarySearch(nums, i + 1, tail, nums[i] + k);
                if (ind > 0) {
                    result ++;
                }
            }
        }
        return result;
    }
}


/*
*
A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:
0 <= i, j < nums.length
i != j
a <= b
b - a == k
*
Input: nums = [3,1,4,1,5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
*
*
* Найти все пары (nums[i], nums[j]) такие что nums[i] + к = nums[j]
* Отсортируем массив по увеличению элементов.
* Для того, чтобы в ответ не попадали дубликаты - заведем множество с элементами, которые уже использовались.
* Через бинарный поиск находим индекс предполагаемого элемента nums[i] + k - если такой индекс > 0, добавляем в ответ +1.
*
*
* */