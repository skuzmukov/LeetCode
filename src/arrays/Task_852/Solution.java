package arrays.Task_852;

public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0;
        int hi = A.length - 1;
        int mid;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (A[mid - 1] < A[mid] && A[mid] > A[mid + 1]) {
                return mid;
            } else if (A[mid - 1] < A[mid] && A[mid] < A[mid + 1]) {
                lo = mid;
            } else if (A[mid - 1] > A[mid] && A[mid] > A[mid + 1]) {
                hi = mid;
            }
        }
        return -1;
    }
}


class A {
    public static void main(String[] args) {
        System.out.println(new Solution().peakIndexInMountainArray(new int[] {0, 1, 2, 3, 1, 0}));
    }
}