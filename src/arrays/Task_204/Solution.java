package arrays.Task_204;
//https://leetcode.com/problems/count-primes/
public class Solution {
    public int countPrimes(int n) {
        boolean[] isComposite = new boolean[n];
        int curr;
        for (int i = 2; i < isComposite.length; i++) {
            curr = i + i;
            if (!isComposite[i]) {
                while(curr < isComposite.length) {
                    isComposite[curr] = true;
                    curr += i;
                }
            }
        }
        int res = 0;
        for (int i = 2; i < isComposite.length; i++) {
            if (!isComposite[i]) {
                res ++;
            }
        }
        return res;
    }
}