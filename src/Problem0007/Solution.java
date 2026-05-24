package Problem0007;

public class Solution {
    public static int reverse(int x) {
        final int MAX_POSITIVES =  2147483647;
        final int MAX_NEGATIVES =  -2147483648;
        int xCopy=x;
        int result= 0;
        while(x!=0){

            int digit=x%10;
            if(xCopy>=0 && (result>MAX_POSITIVES/10 || (result==MAX_POSITIVES/10 && digit>7))){
                return 0;
            }
            if(xCopy<0 && (result<MAX_NEGATIVES/10 || (result==MAX_NEGATIVES/10 && digit<-8))){
                return 0;
            }
            result= result*10+digit;
            x=x/10;
            System.out.println(result + " , "+digit+" , "+x);
        }
        return result;
    }
}
