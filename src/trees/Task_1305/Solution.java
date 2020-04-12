package trees.Task_1305;

import utils.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
public class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<Integer>();
        Deque<TreeNode> deque = new ArrayDeque<TreeNode>();
        dfs(root1, deque, result);
        dfs(root2, deque, result);
        result.sort(Integer::compareTo);
        return result;
    }

    private void dfs(TreeNode root, Deque<TreeNode> deque, List<Integer> values) {
        TreeNode curr;
        if (root != null) { deque.add(root); }
        while (!deque.isEmpty()) {
            curr = deque.pollLast();
            values.add(curr.val);
            if (curr.left != null) { deque.add(curr.left); }
            if (curr.right != null) { deque.add(curr.right); }
        }
    }
}

/*
first try/ Runtime: 62 ms, faster than 5.31% of Java online submissions for All Elements in Two Binary Search Trees.
Memory Usage: 84.7 MB, less than 100.00% of Java online submissions for All Elements in Two Binary Search Trees.
*/