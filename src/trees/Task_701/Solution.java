package trees.Task_701;

import utils.TreeNode;
//https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        insert(root, val);
        return root;
    }

    private void insert(TreeNode root, int val) {
        boolean isLeft = root.val > val;
        if (isLeft && root.left == null) {
            root.left = new TreeNode(val);
            return;
        }
        if (!isLeft && root.right == null) {
            root.right = new TreeNode(val);
            return;
        }
        if (isLeft) {
            insert(root.left, val);
        } else {
            insert(root.right, val);
        }
    }
}

/*
*
* Вставка в бинарное дерево нового значения
*
* */