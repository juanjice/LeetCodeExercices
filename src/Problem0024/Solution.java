package Problem0024;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode refNex= head.next;
        head.next= swapPairs(head.next.next);
        refNex.next=head;
        return refNex;
    }
}
//funciona! , O(n)
