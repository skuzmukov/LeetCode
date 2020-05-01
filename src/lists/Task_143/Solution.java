package lists.Task_143;

import utils.ListNode;
//https://leetcode.com/problems/reorder-list/
public class Solution {
    public void reorderList(ListNode head) {
        ListNode curr = head;
        ListNode last;
        ListNode node;
        if (head == null) { return; }
        while (curr.next != null && curr.next.next != null) {
            node = curr.next;
            while (node.next != null && node.next.next != null) {
                node = node.next;
            }
            last = node.next;
            node.next = null;

            last.next = curr.next;
            curr.next = last;

            curr = last.next;
        }
    }
}
/*
Runtime: 848 ms, faster than 5.01% of Java online submissions for Reorder List.
Memory Usage: 41.9 MB, less than 6.82% of Java online submissions for Reorder List.
*/