package Problem0088;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        int[] a = {1,2,3,0,0,0};
//        int[] b = {2,5,6};
//        int[] a = {4,5,6,0,0,0};
//        int[] b = {1,2,3};
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
//        Try2.merge(a,3,b,3);
        Solution.merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    }
}
