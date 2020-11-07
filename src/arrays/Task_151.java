package arrays;

import java.util.Arrays;

public class Task_151 {

}

class Main {
    public static void main(String[] args) {
        String s = "Bob    Loves       Alice";
        System.out.println(trim(s.toCharArray(), 0, s.length()));
    }

    public static int trim(char[] chars, int l, int r) {
        int temp = l;
        int space = 0;
        while (temp < r) {
            while (temp < r && chars[temp] != ' ') {
                chars[l++] = chars[temp++];
            }
            if (temp < r) {
                chars[l] = ' ';
                l ++;
            }

            while (temp < r && chars[temp] == ' ') {
                temp ++;
                space ++;
            }
        }
        return l;
    }
}