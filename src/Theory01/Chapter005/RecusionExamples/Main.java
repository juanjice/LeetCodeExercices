package Theory01.Chapter005.RecusionExamples;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args){

        File directory = new File("/home/juanjice/Documentos/practice");
        freeDisk(directory);
        System.out.println(Arrays.toString(directory.list()));
        System.out.println(directory.getTotalSpace());
        System.out.println(directory.length());

    }
    public static long freeDisk(File root){
        long total=root.length();
        if(root.isDirectory()){
            for(String child : Objects.requireNonNull(root.list())){
                total+=freeDisk(new File(root,child));
            }
        }
        System.out.println(total + "\t"+ root);
        return total;
    }
}

