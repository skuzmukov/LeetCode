package arrays.Task_905;

class Solution {
//    public int[] sortArrayByParity(int[] A) {
//        int i = 0;
//        int j = i + 1;
//        while (j < A.length) {
//            while (i < A.length && A[i] % 2 == 0) {i ++;}
//            j = i + 1;
//            while (j < A.length && A[j] % 2 != 0) {j ++;}
//            if (j < A.length && i < A.length) {
//                A[i] = A[i] + A[j];
//                A[j] = A[i] - A[j];
//                A[i] = A[i] - A[j];
//            }
//            i++;
//            j++;
//        }
//        return A;
//    }

    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int evenIndex = 0;
        int oddIndex = A.length - 1;
        for (int i = 0; i < A.length; i ++) {
            if ((A[i] & 1) == 0) {
                res[evenIndex ++] = A[i];
            } else {
                res[oddIndex --] = A[i];
            }
        }
        return res;
    }
}