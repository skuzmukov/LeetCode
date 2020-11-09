package strings;
//https://leetcode.com/problems/multiply-strings/
public class Task_43 {
    public String multiply(String num1, String num2) {

        if ("0".equals(num1) || "0".equals(num2)) { return "0"; }

        int n = num1.length();
        int m = num2.length();

        int[] res = new int[n + m];

        int threshold = 0;
        int index = res.length;

        int rest;

        int len = res.length - 1;

        int val;

        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();

        for (int i = n - 1; i >= 0; i--) {
            index = len - threshold;
            rest = 0;

            for (int j = m - 1; j >= 0; j--) {
                val = rest + (a[i] - '0') * (b[j] - '0') + res[index];
                res[index--] = val % 10;
                rest = val / 10;
            }

            while (rest > 0) {
                res[index--] = rest % 10;
                rest /= 10;
            }

            threshold ++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = index + 1; i < res.length; i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }
}


/*
*
*
*
* */