package Problem1;

import java.util.Arrays;

public class Try1 {
    public static int[] twoSum(int[] nums, int target) {
            for(int i=0 ; i<nums.length;i++){
                for(int j=i+1; j<nums.length;j++){
                    int check = nums[i]+nums[j];
                    if(check ==target) return new int[]{i,j};
                }
            }
            return null;
    }
}
//O(n2)