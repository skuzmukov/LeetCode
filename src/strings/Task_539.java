package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/minimum-time-difference/
public class Task_539 {
    public int findMinDifference(List<String> timePoints) {

        List<Integer> minutes = new ArrayList<>(timePoints.size());

        for (String date : timePoints) {
            minutes.add(dateToMinutes(date));
        }

        int min = 1440; // minutesPerDay;

        Collections.sort(minutes);

        for (int i = 0; i < minutes.size() - 1; i++) {
            min = Math.min(minutes.get(i + 1) - minutes.get(i), min);
        }

        return Math.min(min, minutes.get(0) + (1440 - minutes.get(minutes.size() - 1)));
    }

    private int dateToMinutes(String date) {

        int hour = 0;
        int minutes = 0;
        hour += (date.charAt(0) - '0') * 10;
        hour += (date.charAt(1) - '0');

        minutes += (date.charAt(3) - '0') * 10;
        minutes += (date.charAt(4) - '0');

        minutes += hour * 60;

        return minutes == 0 ? 1440 : minutes;
    }
}
