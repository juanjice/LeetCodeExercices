package Theory01.Chapter003FundamentalStructures.UsingArrays.SortingArray;

//InsertionSort
public class Main {
    public static void main(String[] args){
        char[] data =  {'B','C','D','A','E','H','G','F','0', 125};
        insertionSort(data);
        for(char a :data){
            System.out.print(a+" , ");
        }
    }
    public static void insertionSort(char[] data){
        for(int i=0;i<data.length;i++){
            int j=i;
            while(j>0 && data[j-1]>data[j]){
                char temp = data[j];
                data[j]= data[j-1];
                data[j-1]=temp;
                j--;
            }
        }
    }
}

