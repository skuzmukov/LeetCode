package arrays.Task_922;

import java.util.Arrays;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] arr = new int[1001];
        for (int i = 0; i < A.length; i++) {
            arr[A[i]] ++;
        }
        int in = 0;
        for(int i = 0; i < arr.length; i += 2) {
            if (arr[i] != 0) {
                while(arr[i]-- > 0) {
                    A[in] = i;
                    in += 2;
                }
            }
        }
        in = 1;
        for(int i = 1; i < arr.length; i += 2) {
            if (arr[i] != 0) {
                while (arr[i]-- > 0) {
                    A[in] = i;
                    in += 2;
                }
            }
        }
        return A;
    }
}


class A {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortArrayByParityII(new int[]{1,1,0,4})));
    }
}