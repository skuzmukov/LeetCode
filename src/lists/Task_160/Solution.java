package lists.Task_160;

import utils.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        ListNode temp = headA;
        while (temp != null) {
            temp = temp.next;
            lengthA ++;
        }
        temp = headB;
        while (temp != null) {
            temp = temp.next;
            lengthB ++;
        }
        ListNode a = headA;
        ListNode b = headB;

        if (lengthA > lengthB) {
            int diff = lengthA - lengthB;
            while (diff-- > 0) {
                a = a.next;
            }
        } else {
            int diff = lengthB - lengthA;
            while (diff-- > 0) {
                b = b.next;
            }
        }
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
            else {
                a = a.next;
                b = b.next;
            }
        }
        return null;
    }
}