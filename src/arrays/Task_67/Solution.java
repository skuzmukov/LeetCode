package arrays.Task_67;
//https://leetcode.com/problems/add-binary/
public class Solution {
    public String addBinary(String a, String b) {
        return a.length() >= b.length() ? add(a, b) : add(b, a);
    }

    String add(String a, String b) {
        char[] res = new char[a.length() + 1];
        int i = res.length - 1;
        int diff = a.length() - b.length();
        int curr = 0;
        int temp = 0;
        for (int j = b.length() - 1; j >= 0; j--) {
            temp = b.charAt(j) - '0' + a.charAt(j + diff) - '0' + curr;
            res[i--] = (char) ((temp & 1) + '0');
            curr = (temp >> 1) & 1;
        }
        for (int j = diff - 1; j >= 0; j--) {
            temp = curr + a.charAt(j);
            res[i--] = (char) ((temp & 1) + '0');
            curr = (temp >> 1) & 1;
        }
        if (curr != 0) {
            res[i] = (char) (curr + '0');
        } else {
            i++;
        }
        return String.valueOf(res, i, res.length - i);
    }
}
