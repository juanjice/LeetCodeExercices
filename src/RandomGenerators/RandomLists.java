package RandomGenerators;

import java.util.*;

public class RandomLists {
    public static int[] generateRandomAndUniqueElements(int n,int max){
        if(max<n){
            max=Integer.MAX_VALUE;
        }
        Random random = new Random();
        Set<Integer> conjuntoUnicos = new HashSet<>();

        // El bucle se repite hasta que el conjunto tenga exactamente 'n' elementos
        while (conjuntoUnicos.size() < n) {
            int numeroAleatorio = random.nextInt(max);
            conjuntoUnicos.add(numeroAleatorio);
        }

        // Convertir el conjunto a una lista final
        List<Integer> listFinal = new ArrayList<>(conjuntoUnicos);
        return listFinal.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] generateRange(int startInclusive, int endExclusive) {
        int[] result = new int[endExclusive - startInclusive];

        for (int i = 0; i < result.length; i++) {
            result[i] = startInclusive + i;
        }

        return result;
    }

}
