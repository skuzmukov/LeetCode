package math;


//https://leetcode.com/problems/the-kth-factor-of-n/
public class Task_1492 {
    public int kthFactor(int n, int k) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter ++;
                if (counter == k) {
                    return i;
                }
            }
        }
        return -1;
    }
}