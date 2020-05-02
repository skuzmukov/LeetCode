package trees.Task_897;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/increasing-order-search-tree/
public class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        order(list, root);
        TreeNode r = new TreeNode(-1);
        TreeNode node = r;
        for (int i : list) {
            TreeNode n = new TreeNode(i);
            node.right = n;
            node = n;
        }
        return r.right;
    }

    void order(List<Integer> list, TreeNode root) {
        if (root == null) { return; }
        order(list, root.left);
        list.add(root.val);
        order(list, root.right);
    }
}
/*
Runtime: 1 ms, faster than 27.35% of Java online submissions for Increasing Order Search Tree.
Memory Usage: 39.3 MB, less than 65.63% of Java online submissions for Increasing Order Search Tree.
*/