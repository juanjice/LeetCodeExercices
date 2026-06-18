package Problem0088;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Try {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums2Pointer=0;
        if(nums2.length==0) return;
        if(m+n==0) return;

        int nums1Length = nums1.length;
        for(int i = 0; i<= nums1Length-1; i++){
            System.out.println(Arrays.toString(nums1)+" , "+i);
            System.out.println(Arrays.toString(nums2)+" , "+nums2Pointer);
            if(nums2Pointer>=n) return;
            if(nums1[i]>nums2[nums2Pointer]){
                int j=i;
                int bubble=nums2[nums2Pointer];
                while(j< nums1Length){
                    int current= nums1[j];
                    nums1[j]=bubble;
                    j++;
                    bubble=current;
                }
                nums2Pointer++;
            }else if(nums2Pointer+m<=i){
                nums1[i]=nums2[nums2Pointer];
                nums2Pointer++;
            }
        }
    System.out.println(Arrays.toString(nums1));
   }
}
