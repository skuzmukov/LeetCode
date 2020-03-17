package arrays.Task_66;

public class Solution {
    public int[] plusOne(int[] digits) {
        int res = 0;
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i --) {
            digits[i] = res + digits[i];
            if (digits[i] > 9) {
                res = 1;
                digits[i] -= 10;
            } else {
                res = 0;
            }
        }
        if (res != 0) {
            int[] arr = new int[digits.length + 1];
            arr[0] = res;
            System.arraycopy(digits, 0, arr, 1, digits.length);
            return arr;
        }
        return digits;
    }
}
