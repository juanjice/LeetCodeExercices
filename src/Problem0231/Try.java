package Problem0231;

public class Try {
    public static boolean isPowerOfTwo(int n) {
        if(n==2 || n==1){
            return true;
        }else if(n%2==0){
            return isPowerOfTwo(n/2);
        }else{
            return false;
        }

    }
}
//revienta stack overflow, por que no quiere recursividad
//Current complexity:
//O(logN)O(logN)
//Suggested complexity:
//O(1)O(1)
//Suggestions:Handle zero and negative inputs immediately to prevent infinite recursion, or use bit manipulation for constant time.
//quiere una forma de determinarlo de forma constante