package Problem0024;

public class Try1 {
    public static ListNode swapPairs(ListNode head) {
        //swap just first two
        System.out.println("voy a swapear , "+head.toString());
        if(head.next!=null){
            ListNode referenceToNextTwo;
            if(head.next.next==null){
                referenceToNextTwo=null;
            }else{
                referenceToNextTwo=swapPairs(new ListNode(head.next.next.val,head.next.next.next));
            }

            head.next.next=null;
            ListNode referenceJustNext= new ListNode(head.next.val,head.next);
            head.next=referenceToNextTwo;
            referenceJustNext.next=head;
            //head.next.next=referenceToNextTwo;
            head=referenceJustNext;
            return head;
        }
//        if(head.next.next == null){
//            ListNode referenceJustNext= new ListNode(head.next.val,head.next);
//            referenceJustNext.next=head;
//            head=referenceJustNext;
//            System.out.println("Retornando : "+head);
//            return head;
//        }
        return head;
    }
}
