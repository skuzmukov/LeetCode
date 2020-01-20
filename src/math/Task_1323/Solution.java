package math.Task_1323;

public class Solution {
    public int maximum69Number (int num) {
        int i = 0;
        int max = -1;
        int temp = 0;
        int numClone = num;
        while (numClone > 0) {
            temp = numClone % 10;
            numClone = numClone / 10;
            if (temp == 6) {
                max = i;
            }
            i++;
        }
        if (max > -1) {
            num += 3 * Math.pow(10, max);
        }
        return num;
    }
}
