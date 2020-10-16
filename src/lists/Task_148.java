package lists;

import utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/sort-list/
public class Task_148 {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode tempHead = new ListNode(-1);

        ListNode currentNode = head;
        while(currentNode != null) {
            list.add(currentNode.val);
            currentNode = currentNode.next;
        }

        Collections.sort(list);

        currentNode = tempHead;
        ListNode temp = null;
        for (int i : list) {
            temp = new ListNode(i);
            currentNode.next = temp;
            currentNode = temp;
        }

        return tempHead.next;
    }
}

/*
*
* Сортировка связного списка
*
* */