package arrays.Task_1431;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int count : candies) {
            if (count > max) { max = count; }
        }
        List<Boolean> res = new ArrayList<Boolean>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}