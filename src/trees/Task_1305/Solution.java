package trees.Task_1305;

import utils.TreeNode;

import java.util.*;

// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        inorder(root1, result1);
        inorder(root2, result2);
        List<Integer> res = new ArrayList<>(result1.size() + result2.size());
        int i = 0;
        int j = 0;
        while (i < result1.size() && j < result2.size()) {
            if (result1.get(i) <= result2.get(j)) {
                res.add(result1.get(i++));
            } else {
                res.add(result2.get(j++));
            }
        }
        while (i < result1.size()) { res.add(result1.get(i++)); }
        while (j < result2.size()) { res.add(result2.get(j++)); }
        return res;
    }

    private List<Integer> inorder(TreeNode root, List<Integer> values) {
        if (root == null) { return values; }
        inorder(root.left, values);
        values.add(root.val);
        inorder(root.right, values);
        return values;
    }
}

/*
second try/ Runtime: 13 ms, faster than 88.77% of Java online submissions for All Elements in Two Binary Search Trees.
Memory Usage: 42.1 MB, less than 100.00% of Java online submissions for All Elements in Two Binary Search Trees.
*/