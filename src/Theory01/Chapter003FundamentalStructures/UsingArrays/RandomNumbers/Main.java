package Theory01.Chapter003FundamentalStructures.UsingArrays.RandomNumbers;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand =  new Random();
        rand.setSeed(System.currentTimeMillis());
        int[] nums = new int[100];
        for(int i =0; i< nums.length; i++){
            nums[i]=rand.nextInt(200);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        


    }

}
