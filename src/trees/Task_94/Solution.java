package trees.Task_94;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) { return ;}
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}