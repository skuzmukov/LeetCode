package trees.Task_572;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/subtree-of-another-tree/
public class Solution {
    List<TreeNode> nodes = new ArrayList<TreeNode>();
    public boolean isSubtree(TreeNode s, TreeNode t) {
        findNode(s, t.val);
        for (TreeNode tNode : nodes) {
            if (isSubTree(tNode, t)) { return true; }
        }
        return false;
    }

    void findNode(TreeNode node, int val) {
        if (node == null) { return; }
        findNode(node.left, val);
        if (node.val == val) { nodes.add(node); }
        findNode(node.right, val);
    }

    boolean isSubTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) { return true; }
        return s != null && t != null && s.val == t.val && isSubTree(s.left, t.left) && isSubTree(s.right, t.right);
    }
}