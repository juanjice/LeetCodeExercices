package Problem3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem3 {
    public static void main(String[] args){

System.out.println(lengthOfLongestSubstring("holaaaaaasdcn"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int lengthS=s.length();
        if(lengthS<=1) return lengthS;
        int[] window= {0,1};
        int maxSubstring=1;
        while(window[1]<=lengthS){
            //check if current window has repeated
            if(window[1]+1>s.length()) break;
            String subsS=s.substring(window[0],window[1]+1);
            Set<String> stringSet= new HashSet<>(List.of(subsS.split("")));
            int length = subsS.length();
            //if not increase rigth window
            if(length ==stringSet.size()){
                if(length >maxSubstring) maxSubstring= length;
                window[1]++;
            }else{
                window[1]++;
                window[0]++;
            }
        }

        return maxSubstring;
    }
    /*
    Given a string s, find the length of the longest substring without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

     */
}
