package theory.dataStructuresJava.singleLinkedList;

public class SingleLinkedList<T> {
    private int size=0;
    private Node<T> head;
    private Node<T> tail;

    public static class Node<T>{
        private Node<T> nextNode;
        private final T value;
        public Node(T v,Node<T> n){
            nextNode=n;
            value=v;
        }

        public T getValue() {
            return value;
        }
        public Node<T> getNextNode(){
            return this.nextNode;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
    }

    public boolean isEmpty(){
        return size==0;
    }
    public T first(){
        if(isEmpty()) return null;
        return head.getValue();
    }
    public T last(){
        if(isEmpty()) return null;
        return tail.getValue();
    }
    public void addFirst(T newValue){
        head = new Node<>(newValue,head);
        if(size==0) tail=head;
        size++;
    }
    public void addLast(T newValue){
        Node<T> newTail=new Node<>(newValue,null);
        if(size==0){
            head=newTail;

        }else{
            tail.setNextNode(newTail);
        }
        tail= newTail;
        size++;
    }
    public T removeFirst(){
        if(isEmpty()) return null;
        T result = head.getValue();
        head= head.getNextNode();
        size--;
        if(size==0){
            tail=null;
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        Node<T> nextEval= head;
        while (nextEval!=null){
            result.append(nextEval.getValue().toString());
            if(nextEval.nextNode==null){
                result.append(" ]");
            }else{
                result.append(" , ");
            }
            nextEval=nextEval.getNextNode();
        }

    return result.toString();
    }
}
