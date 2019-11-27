package strings.Task_1189;

class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = Integer.MAX_VALUE;
        int[] arr = new int[26];

        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'a'] += 1;
        }

        String s = "abn";
        String e = "lo";

        for (int i = 0; i < s.length(); i++) {
            res = Math.min(res, arr[s.charAt(i) - 'a']);
        }

        for (int i = 0; i < e.length(); i++) {
            res = Math.min(res, (arr[e.charAt(i) - 'a'] / 2));
        }

        return res;
    }
}