package trees.Task_144;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root, res);

        return res;
    }

    void preorder(TreeNode root, List<Integer> list) {
        if (root == null) { return ; }
        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }


}