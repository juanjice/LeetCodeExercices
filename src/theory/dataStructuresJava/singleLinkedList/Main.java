package theory.dataStructuresJava.singleLinkedList;

public class Main {
    public static void main(String[] args){



    }
    public static class Node{
        Node next;
        int value;
        public Node(int val){
            value=val;
        }
        public Node(int a, Node b){
            value=a;
            next=b;
        }
    }
}
