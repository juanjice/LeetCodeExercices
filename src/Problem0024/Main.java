package Problem0024;

public class Main {
    public static void main(String[] args){
        ListNode problem= ListNode.of(1,2,3,4,5,6,7);
        System.out.println(problem);
        ListNode result = Try1.swapPairs(problem);
        System.out.println(result);
    }
    public ListNode swapPairs(ListNode head) {
        return null;
    }
}
/*
24. Swap Nodes in Pairs
Medium
Topics
premium lock iconCompanies

Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)



Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:

Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]



Constraints:

    The number of nodes in the list is in the range [0, 100].
    0 <= Node.val <= 100


 */