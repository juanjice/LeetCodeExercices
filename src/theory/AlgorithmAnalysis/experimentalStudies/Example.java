package theory.AlgorithmAnalysis.experimentalStudies;

import java.util.Arrays;

public class Example {
    public static void main(String[] args){
        final int experimentL =3;
        final int characters = 5000;
        long[] algo1 = new long[experimentL];
        for(int i = 1; i<= experimentL; i++){
            long startTime = System.nanoTime();
            concat1(65,30,Math.pow(characters,i));
            long endTime = System.nanoTime();
            long elapsedTime=endTime-startTime;
            System.out.println("n : "+i+" , time : "+elapsedTime/ 1_000_000.0);
            algo1[i-1]=elapsedTime;
        }
        System.out.println(Arrays.toString(algo1));
    }
    public static void concat1(int startChar,int topChar, double n){
        StringBuilder result= new StringBuilder();
        for(int i=0; i<n;i++){

            int charNum=(i%topChar)+startChar;
            result.append((char) charNum);
        }
        //System.out.println(result);
    }
    public static void concat2(int startChar,int topChar, double n){
        String result= "";
        for(int i=0; i<n;i++){

            int charNum=(i%topChar)+startChar;
            result+=charNum;
        }
        //System.out.println(result);
    }
}
