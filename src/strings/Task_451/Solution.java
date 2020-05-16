package strings.Task_451;

import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/sort-characters-by-frequency/
public  class Solution {
    public String frequencySort(String s) {
        int [] freq = new int[126];

        for (char c : s.toCharArray()) {
            freq[c] ++;
        }
        PriorityQueue<Obj> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(it -> -it.freq));
        for (int i = 0; i < freq.length; i ++) {
            if (freq[i] > 0) {
                priorityQueue.add(new Obj(freq[i], (char) i));
            }
        }
        int f;
        char c;
        StringBuilder res = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            f = priorityQueue.peek().freq;
            c = priorityQueue.peek().c;
            priorityQueue.poll();
            while (f -- > 0) {
                res.append(c);
            }
        }
        return res.toString();
    }
}

class Obj {
    int freq;
    char c;

    public Obj(int freq, char c) {
        this.freq = freq;
        this.c = c;
    }
}