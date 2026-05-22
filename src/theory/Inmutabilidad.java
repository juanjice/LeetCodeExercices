package theory;

public class Inmutabilidad {
    public static void main(String[] args){
        int[] lista1= {1,2,3};
        int[] lista2 = lista1;
        lista1[0]=10;
        System.out.println(lista1);
        System.out.println(lista2);



    }
}
