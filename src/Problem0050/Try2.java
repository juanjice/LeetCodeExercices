package Problem0050;

public class Try2 {
    public static double myPow(double x, int n) {
        if(n<0){
            return 1/recusiveMyPow(x,n*-1);
        }else{
            return  recusiveMyPow(x,n);
        }

    }
    public static double recusiveMyPow(double x, int n){
        if (n == 0) return 1.0;
        if (n == 1) return x;

        double half = recusiveMyPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return x * half * half;
        }

    }
}
// mas cercano
/*
2^50
 halfindex= 25
 finalIndex =50-25 = 25
 recursiveMyPow(2^25)*recursiveMyPow(2^25)
 thridIndex = 50/3 = 16
 secondIndex = 50/3= 16
 finalIndex =50
 */

