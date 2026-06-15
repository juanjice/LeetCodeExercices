package whatever;

public class BitwiseOperations {
    public static void main(String[] args){
        int init= 1;
        int last=22;
        int mascara31Bits = Integer.MAX_VALUE;
        for(int i=init;i<last;i++){
//            System.out.println(i + " , "+ (i^mascara31Bits));
//            System.out.println(Integer.toBinaryString(i) + " , "+ Integer.toBinaryString(~i)+ " , "+ Integer.toBinaryString(i>>1));
            System.out.println(i+ " , "+Integer.toBinaryString(i) + " , "+ Integer.toBinaryString(i>>(i/2))+ " , "+ Integer.toBinaryString(i>>1));
        }
    }
}
