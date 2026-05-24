package Problem0002;

public class Try1 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result= new ListNode();
        ListNode dummyPointer = result;
        int carry=0;
        while(l1!=null || l2!=null || carry>0){
            int val1  = l1==null ? 0 : l1.val;
            int val2=   l2==null ? 0 : l2.val;

            int sum = val1 + val2 + carry;
            carry = sum>9 ? 1: 0;
            sum = sum%10;

            result.next = new ListNode(sum);
            result=result.next;

            l1= l1==null ? null : l1.next;
            l2= l2==null ? null : l2.next;

        }
        return dummyPointer.next;
    }

}
/*
la lista no contiene zeros por delante ni numeros negativos
 */
