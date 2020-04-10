package strings.Task_557;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split("\\s");
        char[] temp;
        char c;
        for (int i = 0; i < strings.length; i++) {
            temp = strings[i].toCharArray();
            for (int j = 0; j < temp.length / 2; j++) {
                c = temp[j];
                temp[j] = temp[temp.length - j - 1];
                temp[temp.length - j - 1] = c;
            }
            strings[i] = String.valueOf(temp);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length - 1; i++) {
            stringBuilder.append(strings[i]).append(' ');
        }
        stringBuilder.append(strings[strings.length - 1]);
        return stringBuilder.toString();
    }
}

//first try Runtime: 13 ms, faster than 27.77% of Java online submissions for Reverse Words in a String III.
//          Memory Usage: 39.9 MB, less than 31.58% of Java online submissions for Reverse Words in a String III.
