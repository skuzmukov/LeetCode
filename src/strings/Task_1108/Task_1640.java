package strings.Task_1108;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/check-array-formation-through-concatenation/
public class Task_1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> map = new HashMap<>(pieces.length);
        for (int[] a : pieces) {
            map.put(a[0], a);
        }
        int index = 0;
        int ind;
        while (index < arr.length) {
            int[] currArr = map.get(arr[index]);
            if (currArr == null) { return false; }
            index ++;
            ind = 1;
            while (ind < currArr.length) {
                if (arr[index] == currArr[ind]) {
                    index ++;
                    ind ++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
*   
* */