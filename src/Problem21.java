import java.util.Optional;

public class Problem21 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2,new  ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3,new  ListNode(4)));
        System.out.println(list1);
        ListNode solution= mergeTwoLists(list1,list2);
        System.out.println(solution);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode result= dummyHead;

        while (list1 != null || list2 != null) {

            Optional<Integer> val1;
            Optional<Integer> val2;
            val1= list1!=null? Optional.of(list1.val) : Optional.empty();
            val2= list2!=null? Optional.of(list2.val) : Optional.empty();
            System.out.println(val1 + " , " + val2);

            if(val1.isEmpty() || ( val2.isPresent() && val2.get()< val1.get())){
                result.next=new ListNode(val2.get());
                list2=list2.next;
                result=result.next;
                continue;
            }

            result.next=new ListNode(val1.get());
            list1=list1.next;
            result=result.next;
        }

        return dummyHead.next;
    }

    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      public String toString(){
          ListNode thisList=this;
          StringBuilder result= new StringBuilder();
          result.append("[");
          while(thisList!=null){
              result.append(thisList.val);
              result.append(" , ");
              thisList=thisList.next;
          }
          result.delete(result.length()-2,result.length());
          result.append("]");
          return result.toString();
      }
    }

/*
   * You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.



Example 1:
*
* Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]


Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
   * */
}
