package strings.Task_1451;

import java.util.Arrays;
import java.util.Comparator;
//https://leetcode.com/problems/rearrange-words-in-a-sentence/
public class Solution {
    public String arrangeWords(String text) {
        text = text.substring(0, 1).toLowerCase() + text.substring(1);
        String[] arr = text.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        arr[0] = arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1);
        return String.join(" ", arr);
    }
}