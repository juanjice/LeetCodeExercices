package Problem0019;

public class Problem19 {
    public static void main(String[] args){
        ListNode list1 = new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode list2 = new ListNode(1, new ListNode(3,new ListNode(4)));
        System.out.println(list1);

    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Paso 0: Crear un nodo dummy para simplificar el caso de eliminar la cabeza.
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Paso 1: Mover el puntero 'fast' n+1 pasos adelante para crear la brecha.
        // Si 'head' es [1,2,3,4,5] y n=2, 'fast' avanzará 3 pasos.
        // dummy -> 1 -> 2 -> 3
        //  ^            ^
        // slow         fast
        for (int i = 0; i <= n; i++) {
            // En caso de que n sea igual al tamaño de la lista, fast se volverá null.
            // El resto del código manejará esto correctamente.
            if (fast == null) return head; // O manejar el error como se prefiera.
            fast = fast.next;
        }

        // Paso 2: Mover 'slow' y 'fast' juntos hasta que 'fast' llegue al final.
        // Cuando fast llegue a null, 'slow' estará en el nodo justo antes del que hay que eliminar.
        // Por ejemplo: 'slow' estará en el nodo '3' para eliminar el '4'.
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Paso 3: Eliminar el nodo. Hacemos que el 'next' de slow salte al siguiente del siguiente.
        // slow.next (que es 4) se reemplaza por slow.next.next (que es 5).
        // La lista se convierte en 3 -> 5.
        slow.next = slow.next.next;

        // Paso 4: Devolvemos dummy.next, que es la cabeza real de la lista.
        return dummy.next;
    }
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val, ListNode next){
            this.val=val;
            this.next=next;
        }
        public String toString(){
            ListNode list=this;
            StringBuilder result=new StringBuilder("[ ");
            while(list!=null){
                result.append(list.val).append(" , ");
                list=list.next;
            }
            result.delete(result.length()-2,result.length());
            result.append("]");
            return result.toString();
        }
    }
}
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]


Constraints:

The number of nodes in the list is sz.
1 <= sz <= 30
0 <= Node.val <= 100
1 <= n <= sz
 */