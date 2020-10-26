package trees;

import utils.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//https://leetcode.com/problems/find-mode-in-binary-search-tree/
public class Task_501 {

    Map<Integer, Integer> freq = new HashMap<>();

    public int[] findMode(TreeNode root) {
        dfs(root, freq);

        int maxCount = Integer.MIN_VALUE;

        for (int count : freq.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        int[] res = new int[freq.values().size()];
        int ind = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (maxCount == entry.getValue()) {
                res[ind ++] = entry.getKey();
            }
        }
        return ind == res.length ? res : Arrays.copyOf(res, ind);
    }

    private void dfs(TreeNode node, Map<Integer, Integer> freq) {
        if (node == null) { return; }
        freq.put(node.val, freq.getOrDefault(node.val, 0) + 1);
        dfs(node.left, freq);
        dfs(node.right, freq);
    }
}

/*
*
* BST [1,null,2,2]
* return 2
*
* Заполняем map элементом и его вхождением в дерево. Ищем максимальное количество вхождений
* Возвращаем все элементы с максимальным вхождением из map
* */