package arrays.Task_38;
//https://leetcode.com/problems/count-and-say/
public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        char curr;
        int i;
        int count;
        while (counter < n) {
            i = 0;
            count = 0;
            while (i < s.length()) {
                curr = s.charAt(i);
                while (i < s.length() && curr == s.charAt(i)) {
                    count++;
                    i++;
                }
                stringBuilder.append(count).append(s.charAt(i - 1));
                count = 0;
            }
            s = stringBuilder.toString();
            stringBuilder.setLength(0);
            counter++;
        }
        return s;
    }
    
    public String countAndSay1(int n) {
        String s = "1";
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;
        char curr;
        int count;
        while (counter < n) {
            curr = s.charAt(0);
            count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == curr) {
                    count++;
                } else {
                    stringBuilder.append(count).append(curr);
                    count = 1;
                    curr = s.charAt(i);
                }
            }
            stringBuilder.append(count).append(curr);
            s = stringBuilder.toString();
            stringBuilder.setLength(0);
            counter ++;
        }
        return s;
    }
}