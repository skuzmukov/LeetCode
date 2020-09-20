
//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
public class Task_1456 {
    public int maxVowels(String s, int k) {
        boolean[] isVowels = new boolean[s.length()];
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < s.length(); i++) {
            //isVowels[i] = Arrays.binarySearch(vowels, s.charAt(i)) >= 0;
            isVowels[i] = isVowel(s.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowels[i]) {
                count ++;
            }
        }

        int max = count;
        for (int i = 1; i < s.length() - k + 1; i++) {
            if (isVowels[i - 1]) {
                count --;
            }
            if (isVowels[i + k - 1]) {
                count ++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}