package Problem0005;

public class Try1 {

    public static String longestPalindrome(String s) {
        String result = "";
        int sLength = s.length();
        if(sLength<=1) return s;
        char[] characters= s.toCharArray();
        for(int i=0;i<s.length();i++){
            StringBuilder internalPalindromic= new StringBuilder(String.valueOf(characters[i]));
            if(result.isEmpty()){
                result=internalPalindromic.toString();
            }
            for(int j=i+1;j<s.length();j++){
                internalPalindromic.append(characters[j]);
                boolean resultP=checkIfPalindromic(internalPalindromic.toString());
                if( resultP && result.length()<internalPalindromic.length()){
                    result=internalPalindromic.toString();
                }
            }

        }
        return result;
    }
    public static boolean checkIfPalindromic(String stringTest){
        for(int i=0;i<stringTest.length()/2;i++){
            char inverseCharAt = stringTest.charAt(stringTest.length()-1 - i);
            if(stringTest.charAt(i)!= inverseCharAt){
                return false;
            }
        }
        return true;
    }
}
