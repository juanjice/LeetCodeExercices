package Problem0015;

import java.util.*;

public class Try1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); // O(1)
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                for(int k=j+1;k< nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0) {
                        List<Integer> subGroup= new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        subGroup.sort(Comparator.comparingInt(a -> a));
                        result.add(subGroup);
                    }
                }
            }
        }
        return List.copyOf(result);
    }
}
//funciona pero es O(n^3) , revienta por time out


