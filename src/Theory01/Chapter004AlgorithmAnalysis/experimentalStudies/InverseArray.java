package Theory01.Chapter004AlgorithmAnalysis.experimentalStudies;

public class InverseArray {
    public static <T> void inverse(T[] elementhood,int low, int high){
        if(low<high){
            T tempVal= elementhood[low];
            elementhood[low]=elementhood[high];
            elementhood[high]=tempVal;
            inverse(elementhood,low+1,high+1);
        }
    }
}
//1 + 1/n veces O(n)