package strings.Task_299;
//https://leetcode.com/problems/bulls-and-cows/
public class Solution {
    public String getHint(String secret, String guess) {
        int[] freq = new int[10];
        for (char c : secret.toCharArray()) {
            freq[c - '0'] ++;
        }
        int A = 0;
        int B = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                A ++;
                freq[secret.charAt(i) - '0'] --;
            }
        }
        int curr;
        for (int i = 0; i < secret.length(); i++) {
            curr = guess.charAt(i) - '0';
            if (secret.charAt(i) != guess.charAt(i) && freq[curr] > 0) {
                B ++;
                freq[curr] --;
            }
        }
        return A + "A" + B + "B";
    }
}