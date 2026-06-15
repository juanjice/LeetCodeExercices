package Theory01.Chapter004AlgorithmAnalysis.AsymptoticAnalysis;

import java.util.Arrays;
import java.util.function.Supplier;

import static RandomGenerators.RandomLists.generateRandomAndUniqueElements;
import static RandomGenerators.RandomLists.generateRange;

public class DisjointThreeSets {
    private static final int ALGORITHM = 3;
    private static volatile boolean blackhole;

    public static void  main(String[] args){
        //soft
        //cuidado con dejar corriendo esto, en el algoritmo 1 y 2 xd, algo 1-> podria tardar mas de 3 a;os para n=1millon, algo 2 , 16 minutos para n=1millon
        int[] sizes = {10, 100, 1_000, 10_000, 100_000, 1_000_000,10_000_000,100_000_000};

        System.out.println("algorithm,n,time(ms),result");

        for (int n : sizes) {
//            int[] set1 = generateRandomAndUniqueElements(n, n+20);
//            int[] set2 = generateRandomAndUniqueElements(n,  n+20);
//            int[] set3 = generateRandomAndUniqueElements( n, n+20);
            int[] set1 = generateRange(0, n);
            int[] set2 = generateRange(n, 2 * n);
            int[] set3 = generateRange(2 * n, 3 * n);
            System.out.println("conjuntos generados");
            // Caso sin intersección común.
            // Esto fuerza a que el algoritmo trabaje más.
            double time = measure(() -> runAlgorithm(set1, set2, set3));
            double seconds = time/1000;
            System.out.printf(
                    "disjoint%d , %d , %.6f ,%.6f, %b%n",
                    ALGORITHM,
                    n,
                    time,
                    seconds,
                    blackhole
            );
        }

    }
    private static double measure(Supplier<Boolean> algorithm) {
        long start = System.nanoTime();

        blackhole = algorithm.get();

        long end = System.nanoTime();

        return (end - start) / 1_000_000.0;
    }
    private static boolean runAlgorithm(int[] set1, int[] set2, int[] set3) {
        return switch (ALGORITHM) {
            case 1 -> disjoint1(set1, set2, set3);
            case 2 -> disjoint2(set1, set2, set3);
            case 3 -> disjoint3(
                    Arrays.copyOf(set1, set1.length),
                    Arrays.copyOf(set2, set2.length),
                    Arrays.copyOf(set3, set3.length)
            );
            default -> throw new IllegalArgumentException("Algoritmo inválido: " + ALGORITHM);
        };
    }
    private static double averageTime(Supplier<Boolean> algorithm, int repetitions) {
        long totalTime = 0;

        for (int i = 0; i < repetitions; i++) {
            long start = System.nanoTime();

            boolean result = algorithm.get();

            long end = System.nanoTime();
            totalTime += end - start;

            // Evita que la JVM descarte la ejecución por optimización
            if (i == -1) {
                System.out.println(result);
            }
        }

        return totalTime / (double) repetitions / 1_000_000.0;
    }
    public static boolean disjoint1(int[] set1 , int[] set2, int[] set3){

        for (int i : set1) {
            for (int j : set2) {
                for (int k : set3) {
                    if ((i == j) && (k == j)) {//O(1)
                        return false;
                    }
                }

            }

        }
        return true;
    }
    //este algoritmo es O(n*m*l) ,por que por cada elemento de n se recorre m y por cada pareja anterior se recorre l
    public static boolean disjoint2(int[] set1 , int[] set2, int[] set3){
        for (int i : set1) {
            for (int j : set2) {
                if(j==i){
                    for (int k : set3) {
                        if ((k == j)) {//O(1)
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    /*si ponemos un if que no permita comprobar todas las parejas set,set2 que no son iguales estamos bajando la complejidad a O(n^2) !Ojo solo en este caso
    ese analisis es valido, esto por que en el peor de los casos todos los elementos de A son iguales a los de B la linea del if es la que se ejecuta O(n^2)
    ese for interno realmente solo se ejecutaria en el peor de los casos O(n) veces por lo que mencionamos afuera de que en el peor de los casos si todos los elementos
    de set1 son iguales a los de set2, (n+m) ejecutariamos el for un numeor max(n,m) veces
     */

    /*
    Assuming it is possible to sort n numbers in O(n log n) time, show that it is posible
     to solve the three-way set disjointness problem in O(n log n) time. Ejercicio de creatividad capitulo4.35()
     */
    public static boolean disjoint3(int[] set1 , int[] set2, int[] set3){
        Arrays.sort(set1);
        Arrays.sort(set2);
        Arrays.sort(set3);

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < set1.length && j < set2.length && k < set3.length) {
            if (set1[i] == set2[j] && set2[j] == set3[k]) {
                return false;
            }

            int min = Math.min(set1[i], Math.min(set2[j], set3[k]));

            if (set1[i] == min) i++;
            if (set2[j] == min) j++;
            if (set3[k] == min) k++;
        }

        return true;
    }
}
