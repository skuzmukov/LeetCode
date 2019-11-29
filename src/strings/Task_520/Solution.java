package strings.Task_520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        int other = 0;
        boolean isFirstCapital = false;
        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) - 'a' >= 0) {
                other ++;
            } else {
                capital ++;
                if (i == 0) {
                    isFirstCapital = true;
                }
            }
        }
        return other == word.length()
                || isFirstCapital && (other == word.length() - 1 || capital == word.length());
    }
}