package strings.Task_709;

public class Solution {
    public String toLowerCase(String str) {
        int aUpper = 'A';
        int zUpper = 'Z';
        int aLower = 'a';

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= aUpper && arr[i] <= zUpper) {
                arr[i] = (char)((int)arr[i] - aUpper + aLower);
            }
        }
        return new String(arr);
    }
}