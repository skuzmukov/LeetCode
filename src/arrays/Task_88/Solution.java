package arrays.Task_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        m--;
        n--;
        while (index >= 0) {
            if (m == -1) {
                nums1[index--] = nums2[n--];
            } else if (n == -1) {
                nums1[index--] = nums1[m--];
            } else {
                nums1[index--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
            }
        }
    }
}
