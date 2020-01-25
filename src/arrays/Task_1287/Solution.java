package arrays.Task_1287;

public class Solution {
    public int findSpecialInteger(int[] arr) {
        // Массив отсортирован - элемент, занимающий более 25 % должен повторится через определенную длину
        int count = arr.length / 4;
        for (int i = 0; i <= arr.length - count; i++) {
            if (arr[i] == arr[i + count]) {
                return arr[i];
            }
        }
        return -1;
    }
}
