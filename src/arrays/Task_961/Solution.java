package arrays.Task_961;

class Solution {
    public int repeatedNTimes(int[] A) {
        int[] arr = new int[1000];
        for(int i = 0; i < A.length; i++) {
            arr[A[i]] += 1;
            if (arr[A[i]] > 1) {
                return A[i];
            }
        }
        return -1;
    }
}