package strings.Task_383;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazines = new int[26];

        for(int i = 0; i < magazine.length(); i++) {
            magazines[magazine.charAt(i) - 'a'] ++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--magazines[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}