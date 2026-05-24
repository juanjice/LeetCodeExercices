package Problem7;

public class Try1 {

    public static int reverse(int x) {
        int max = -2147483647;

        if(x<max | x>=max*-1 | x==0) return 0;
        StringBuilder nums;
        if(x<0){
            nums = new StringBuilder(Integer.toString(x*-1));
            return Integer.parseInt(nums.reverse().toString())*-1;
        }
        nums = new StringBuilder(Integer.toString(x));
        long tempRes = Long.parseLong(nums.reverse().toString());
        if(tempRes*-1<max) return 0;
        return  (int) tempRes;

    }
}
//Es la forma incorrecta de abordar el problema, el detalle esta en que existen entradas menores que el maximo
/*
permitido pero aun asi que al momento de reversar son mayores que el maximo en si
el approach correcto para reverar es usando el poerador modulo, y comprar si el max/10 sigue sienod menor que lo que se lleva reversado
 */