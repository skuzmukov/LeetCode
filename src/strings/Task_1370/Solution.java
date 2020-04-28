package strings.Task_1370;

public class Solution {
    public String sortString(String s) {
        int[] abc = new int[32];
        for (char c : s.toCharArray()) {
            abc[c - 'a'] ++;
        }
        int ind = 0;
        char[] res = new char[s.length()];
        while (ind < s.length()) {
            for (int i = 0; i < abc.length; i++) {
                if (abc[i] > 0) {
                    res[ind++] = (char) (i + 'a');
                    abc[i]--;
                }
            }
            for (int j = abc.length - 1; j >= 0; j--) {
                if (abc[j] > 0) {
                    res[ind++] = (char) (j + 'a');
                    abc[j]--;
                }
            }
        }
        return String.valueOf(res);
    }
}
