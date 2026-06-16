package Problem0024;

public class Solution {
    public static ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        if(head.next!=null){
            ListNode referenceToNextTwo;
            if(head.next.next==null){
                referenceToNextTwo=null;
            }else{
                referenceToNextTwo=swapPairs(head.next.next);
            }
            head.next.next=null;
            ListNode referenceJustNext= new ListNode(head.next.val,head.next);
            head.next=referenceToNextTwo;
            referenceJustNext.next=head;
            head=referenceJustNext;
            return head;
        }
        return head;
    }
}
//funciona!
