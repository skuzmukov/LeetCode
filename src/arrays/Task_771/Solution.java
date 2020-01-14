package arrays.Task_771;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[] arr = new boolean[128];
        for (int i = 0; i < J.length(); i++) {
            arr[J.charAt(i)] = true;
        }
        int res = 0;
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i)]) {
                res ++;
            }
        }
        return res;
    }
}