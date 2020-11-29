package arrays;

//https://leetcode.com/problems/rotate-function/
public class Task_396 {
    public int maxRotateFunction(int[] A) {
        int len = A.length;

        if (len == 0) { return 0; }

        int[] arr = new int[len];

        int v = 0;
        for (int i = 0; i < len; i++) {
            arr[i] = v++;
        }

        int[] values = new int[len];
        v = 1;
        for (int i = 0; i < len; i++) {
            values[i] = v++;
        }
        values[len - 1] = 0;

        int counter = 0;

        int res = Integer.MIN_VALUE;
        int curr = 0;

        while (counter < len) {
            curr = 0;
            for (int i = 0; i < len; i++) {
                curr += A[i] * arr[i];
            }

            res = Math.max(res, curr);

            for (int i = 0; i < len; i++) {
                arr[i] = values[arr[i]];
            }

            counter ++;
        }

        return Math.max(res, curr);
    }
}

/*
*
* Описание
*
* */