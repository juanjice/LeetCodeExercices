package Problem0015;

import java.util.*;

public class Try2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>(); // O(1)
        Map<Integer,List<List<Integer>>> listRest = new HashMap<>();
        //paso 1
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                int rest= -1*(nums[i]+nums[j]);
                if(listRest.containsKey(rest)){
                    listRest.get(rest).add(List.of(i,j,nums[i],nums[j]));

                }else{
                    List<List<Integer>> newKey= new ArrayList<>();
                    newKey.add(List.of(i,j,nums[i],nums[j]));
                    listRest.put(rest,newKey);
                }

            }
            for(int j=i+1;j<nums.length;j++){
                if(listRest.containsKey(j)){

                }
            }
        }
        //paso 2
//        for (int i=0;i<nums.length ;i++) {
//            if (listRest.containsKey(nums[i])) {
//                for (List<Integer> e : listRest.get(nums[i])) {
//                    if(e.get(0)!=i && e.get(1)!=i){
//                        List<Integer> newResult = new ArrayList<>(List.of(nums[i], e.get(2), e.get(3)));
//                        newResult.sort(Comparator.comparingInt(a -> a));
//                        result.add(newResult);
//                    }
//                }
//            }
//        }
        return List.copyOf(result);
    }
}
//podemos aprovechar el recurso que utilizan los hasmaps de que acceder a un valor solo cuesta O(1)
//En realidad hacer esto, hace que del paso 1 salgan un hash de n^2 elementos, que estoy iterando y por dentro
//hay una iteracion que en el peor de los casos puede ser o(n^2), lo cual convertiria el algoritmo en un O(n)+O(n^3) = O(n^3)