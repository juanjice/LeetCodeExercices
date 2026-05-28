package Problem0003;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        if(sLength<1) return 1;
        int[] window={0,0};
        int maxLength=1;
        int distance=1;
        while(window[1]<sLength){
            System.out.println(s.substring(0,window[1]));
            //unique.add(s.charAt());
            distance=window[1]-window[0];

            window[1]++;
        }
        return 1;
    }

}
