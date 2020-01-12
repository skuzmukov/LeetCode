package custom.Task_1281;

public class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mult = 1;
        int temp;
        while (n > 0) {
            temp = n % 10;
            sum += temp;
            mult *= temp;
            n /= 10;
        }
        return mult - sum;
    }
}