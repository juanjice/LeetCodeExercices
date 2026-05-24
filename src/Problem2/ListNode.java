package Problem2;

/**
 * Definition for singly-linked list.
 *
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        ListNode current = this;
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
}
