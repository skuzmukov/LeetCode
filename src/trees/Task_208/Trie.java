package trees.Task_208;

import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/implement-trie-prefix-tree
public class Trie {
    private boolean end;
    private Map<Character, Trie> nodes = new HashMap<>(32);

    /** Initialize your data structure here. */
    public Trie() { }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        int i = word.length() - 1;
        for (char c : word.toCharArray()) {
            if (node.nodes == null) {
                node.nodes = new HashMap<>(32);
            }
            Trie temp = node.nodes.getOrDefault(c, new Trie());
            node.nodes.put(c, temp);
            node = temp;
            if (i -- == 0) {
                node.end = true;
            }
        }
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            node = node.nodes.get(c);
            if (node == null) { return  false; }
        }
        return node.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            node = node.nodes.get(c);
            if (node == null) { return  false; }
        }
        return true;
    }
}

/*
Runtime: 41 ms, faster than 26.88% of Java online submissions for Implement Trie (Prefix Tree).
Memory Usage: 50.7 MB, less than 100.00% of Java online submissions for Implement Trie (Prefix Tree).
*/