package Problem0007;

public class Main {
    public static void main(String[] args){

        int fx =-8121;
        System.out.println(Solution.reverse(fx));
    }
    public int reverse(int x) {
        return 0;
    }
    public static String printBinary(int x){
        if(x>=0) return String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        return Integer.toBinaryString(x);
    }

}
/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21



Constraints:

    -231 <= x <= 231 - 1

 */