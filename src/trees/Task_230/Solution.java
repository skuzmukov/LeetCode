package trees.Task_230;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class Solution {
    List<Integer> list = new ArrayList<Integer>();

    void inorder(TreeNode root) {
        if (root == null) { return; }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root);
        return list.get(k - 1);
    }
}
// NB inorder  - return all nodes in natural order !! recursion is recursion