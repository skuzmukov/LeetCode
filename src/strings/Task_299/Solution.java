package strings.Task_299;
//https://leetcode.com/problems/bulls-and-cows/
class Solution {
    public String getHint(String secret, String guess) {
        int[] sec = new int[10];
        boolean[] isFound = new boolean[secret.length()];

        int A = 0;
        int B = 0;

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                isFound[i] = true;
                A ++;
            } else {
                sec[secret.charAt(i) - '0'] ++;
            }
        }

        for (int i = 0; i < secret.length(); i++) {
            int index = guess.charAt(i) - '0';
            if (!isFound[i] && sec[index] > 0) {
                sec[index] --;
                B ++;
            }
        }

        return new StringBuilder().append(A).append("A").append(B).append("B").toString();
    }
}