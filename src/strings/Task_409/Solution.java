package strings.Task_409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];
        for (char c : s.toCharArray()) {
            arr[c] ++;
        }
        int res = 0;
        boolean isOdd = false;
        for (int i : arr) {
            res += i / 2;
            if (!isOdd && i % 2 == 1) {
                isOdd = true;
            }
        }
        return isOdd ? 2 * res + 1 : 2 * res;
    }
}