package Problem0029;

public class Try1 {
    public static int divide(int dividend, int divisor) {
        if(dividend==0) return 0;
        int loop=0;
        int result=0;
        boolean isNeg=(dividend>0 && divisor<0)||(dividend<0 && divisor>0);
        int nomralizedDividend=dividend;
        int normalizedDivisor=divisor;

        if(dividend<0) nomralizedDividend=~dividend+1;
        if(divisor<0) normalizedDivisor=~divisor+1;

        if(nomralizedDividend==normalizedDivisor & isNeg) return (~1+1);
        if(nomralizedDividend==normalizedDivisor & !isNeg) return (1);

        System.out.println(normalizedDivisor + " , "+nomralizedDividend + " , "+isNeg);
        while(result<nomralizedDividend){
            result=result+normalizedDivisor;
            loop++;
        }
        if(result>dividend) loop--;
        if(isNeg) loop=~loop+1;
        return loop;
    }
}
