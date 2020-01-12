package lists.Task_209;

import utils.ListNode;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {return null;}
        ListNode newHead = new ListNode(head.val);
        ListNode temp = head.next;
        ListNode x;
        while(temp != null) {
            x = new ListNode(temp.val);
            x.next = newHead;
            newHead = x;
            temp = temp.next;
        }
        return newHead;
    }

    public ListNode reverseList1(ListNode head) {
        ListNode temp = head;
        ListNode newHead = null;
        while (temp != null) {
            ListNode x = temp.next;
            temp.next = newHead;
            newHead = temp;
            temp = x;
        }
        return newHead;
    }
}