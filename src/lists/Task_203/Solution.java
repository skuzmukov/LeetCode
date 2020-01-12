package lists.Task_203;

import utils.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode current = fake;
        while(current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return fake.next;
    }
}