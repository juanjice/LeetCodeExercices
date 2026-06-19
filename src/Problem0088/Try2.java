package Problem0088;

import java.util.Arrays;

public class Try2 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length==0) return;
        if(m+n==0) return;
        int i=0;
        int j=nums2.length-1;
        int k=0;
        int nums1Length = nums1.length;
        while(i< nums1Length){
            System.out.println(Arrays.toString(nums1)+" , "+i);
            System.out.println(Arrays.toString(nums2)+" , "+j+" , "+k);
            int v1=nums1[i];
            int v2=nums2[j];
            if(v1>v2 & i<m){
                nums1[i]=v2;
                nums2[j]=v1;

            }
            if(i<m && j>0){
                j--;
                continue;
            }
            if(j==0 & i<m){
                i++;
                j=nums2.length-1;
                continue;
            }
            if(k<nums2.length){
                nums1[i]=nums2[k];
                k++;
                i++;
            }

        }
    }
}
//Solucion menos optima que la anterior O(MXN)