package Theory01.Chapter004AlgorithmAnalysis.AsymptoticAnalysis;

public class PrefixAverages {
    public static double[] returnPrefixes(double[] x) {

        int length = x.length;
        double[] result = new double[length]; //O(N)
        for (int i = 0; i < length; i++) {
            double value = 0; // O(n)
            for (int j = 0; j <= i; j++) { // este loop se ejecuta 1+2+3+4 .... + n veces eso se reduce en O(n^2)
                value += x[j];
            }
            result[i] = value / (i + 1); // O(n)
        }
        return result;
    }
    //O(n^2)+ O(n)+O(n) = O(n^2)
}
