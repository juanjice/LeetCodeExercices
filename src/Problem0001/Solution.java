package Problem0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result= new HashMap<>(nums.length);
        for(int i = 0 ; i<nums.length;i++){
            int val = nums[i];
            int dif= target-val;
            if(result.containsKey(dif)){
                return new int[]{i,result.get(dif)};
            }
            result.put(val,i);
        }
        return null;
    }
}
//Aprovecharmos que la complejidad algoritmica de Map, para recuperar un elemento es siempre O(1)
