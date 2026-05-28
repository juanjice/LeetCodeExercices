package Theory01.Chapter003FundamentalStructures.singleLinkedList;

public class Main {
    public static void main(String[] args){
        SingleLinkedList<String> myLinkedList = new SingleLinkedList<>();

        myLinkedList.addFirst("hola");
        myLinkedList.addFirst("mundo");
        myLinkedList.addFirst("como");
        myLinkedList.addFirst("estan");
        myLinkedList.addFirst("soy una linked list");
        myLinkedList.addLast("de ultimas");

        SingleLinkedList<String> myLinkedList2 = new SingleLinkedList<>();

        myLinkedList2.addLast("hola");
        myLinkedList2.addFirst("mundo");
        myLinkedList2.addFirst("como");
        myLinkedList2.addFirst("eliminar");
        String element=myLinkedList2.removeFirst();


        System.out.println(myLinkedList);
        System.out.println(myLinkedList2);
        System.out.println("Elemento elminado : "+element);

    }

}
