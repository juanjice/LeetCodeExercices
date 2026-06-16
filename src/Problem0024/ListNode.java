package Problem0024;

import org.w3c.dom.ls.LSException;

public class ListNode {
    int val;
    ListNode next;
    ListNode(){

    }
    ListNode(int val) { this.val = val; }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        Problem0024.ListNode current = this;
        while(current!=null){
            result.append(current.val);
            if(current.next==null){
                result.append(" ]");
            }else{
                result.append(" , ");
            }
            current=current.next;
        }

        return result.toString();
    }
    public static ListNode of(int... values){
        ListNode result = new ListNode(values[0]);
        ListNode current=result;

        for(int i=1 ;i<values.length;i++){
            current.next = new ListNode(values[i]);
            current=current.next;
        }
        return result;
    }
}
