package Problem0012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Try1 {
    public static String intToRomanHolder(int num) {
        Map<Integer, String> numberToLetter =Map.of(
                1, "I",
                5, "V",
                10, "X",
                50, "L",
                100, "C",
                500, "D",
                1000, "M"
        );

        int numCopy=num;
        int unity=1;
        StringBuilder result= new StringBuilder();
        while(numCopy!=0){

            int digit= numCopy%10;
            if(digit==4 || digit==9){
                result.insert(0, numberToLetter.get(unity) + numberToLetter.get((digit + 1) * unity));
            }
            if(digit<4){
                for(int i=0;i<digit;i++){
                    result.insert(0,numberToLetter.get(unity));
                }
            }
            if(digit>=5 && digit<9){
                StringBuilder subRes= new StringBuilder(numberToLetter.get(unity*5));
                    for(int i=5;i<digit;i++){
                        subRes.append(numberToLetter.get(unity));
                    }
                result.insert(0,subRes);
            }

            numCopy/=10;
            unity*=10;
        }
        return result.toString();
    }

}