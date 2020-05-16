package lists.Task_328;

import utils.ListNode;
//https://leetcode.com/problems/odd-even-linked-list/
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode(-1);
        ListNode evenHead = new ListNode(-1);
        ListNode even = evenHead;
        ListNode odd = oddHead;
        int ind = 1;
        while (head != null) {
            if ((ind & 1) == 0) {
                even.next = head;
                even = even.next;
            } else {
                odd.next = head;
                odd = odd.next;
            }
            head = head.next;
            ind ++;
        }
        odd.next = evenHead.next;
        even.next = null;

        return oddHead.next;
    }
}