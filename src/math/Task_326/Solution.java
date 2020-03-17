package math.Task_326;

public class Solution {
    public boolean isPowerOfThree(int n) {
        // 4₂ = 100, 9₃ = 100, 16₄ = 100 //
        String x = Integer.toBinaryString(n);
        System.out.println(x);
        int h = 0;
        int l = x.length() - 1;
        int m = l / 2;
        while (h < m) {
            if (x.charAt(h++) != x.charAt(l--)) {
                return false;
            }
        }
        return true;
    }
}
