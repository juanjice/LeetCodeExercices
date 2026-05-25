package Problem0008;

import java.util.Iterator;
import java.util.List;

public class Try1 {
    public static int myAtoi(String s) {
        char[] chars= s.toCharArray();
        int MAX_VALUE = Integer.MAX_VALUE;
        int MIN_VALUE = Integer.MIN_VALUE;
        boolean start =true;
        int signed=1;
        int result=0;
        for (char e : chars){
            if(e==' ' && start){
                continue;
            }
            if(e=='-' && start){
                signed=-1;
                start=false;
                continue;
            }
            if(e=='+' && start){
                start=false;
                continue;
            }
            if(e<=57 & e>=48){
                start=false;
                int value =Integer.parseInt(String.valueOf(e));
                System.out.println("Result : "+result+" , Value : "+ value);

                if(signed==1 && ((result>MAX_VALUE/10) || (result==MAX_VALUE/10 && value>=7))){
                    result=MAX_VALUE;
                    return result;
                }
                if(signed==-1 && ((result>MAX_VALUE/10) || (result==MAX_VALUE/10 && value>=8))){
                    result=MIN_VALUE;
                    return result;
                }
                result=result*10+value;
                System.out.println("Result : "+result+" , Value : "+ value);
            }else{
                return result*signed;
            }
        }
        return result*signed;
    }


}
// Solucion funcional pero optimizable por 1 ms