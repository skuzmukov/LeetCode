package arrays.Task_380;

import java.util.*;

//https://leetcode.com/problems/insert-delete-getrandom-o1/
public class RandomizedSet {

    private Random random = new Random();
    private List<Integer> elements = new ArrayList<>();
    private Map<Integer, Integer> hash = new HashMap<>();
    /** Initialize your data structure here. */
    public RandomizedSet() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (hash.containsKey(val)) { return false; }
        hash.put(val, elements.size());
        elements.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!hash.containsKey(val)) { return false; }
        int ind = hash.get(val);
        int last = elements.get(elements.size() - 1);
        elements.set(ind, last);
        elements.remove(elements.size() - 1);
        hash.put(last, ind);
        hash.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return elements.get(random.nextInt(elements.size()));
    }
}