package Problem0015;

import java.util.*;

public class Try3 {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Set<Integer>> initialMap= new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();
        int length=nums.length;
        for(int i=0;i< length;i++){//O(n)
            if(initialMap.containsKey(nums[i])){
                initialMap.get(nums[i]).add(i);//O(1)
            }else{
                initialMap.put(nums[i], new LinkedHashSet<>(Set.of(i)));
            }
        }
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                int numI=nums[i];
                int numJ= nums[j];
                int rest= -(numI+numJ);

                if(initialMap.containsKey(rest)){
                    Set<Integer> testSet= initialMap.get(rest);
                    boolean hasI=testSet.remove(i);
                    boolean hasJ=testSet.remove(j);
                    if(!testSet.isEmpty()){
                        List<Integer> newResult = new ArrayList<>(List.of(rest,numI,numJ));
                        newResult.sort(Comparator.comparingInt(a -> a));
                        result.add(newResult);
                    }
                    if(hasI) testSet.add(i);
                    if(hasJ) testSet.add(j);

                }
            }
        }

        return List.copyOf(result);
    }
}
//Esto si es O(n^2), leet code esta castigando las constantes, en la practica la asintota si esta bien para valores grande sde N, el algoritmoe sta
//bien planteado en si, falta pulir recursos que estoy utilizzando sobre todo los recursos de la biblioteca Collections