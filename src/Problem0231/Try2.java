package Problem0231;

public class Try2 {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int lsb = n & -n;
        return lsb==n;
    }
}
