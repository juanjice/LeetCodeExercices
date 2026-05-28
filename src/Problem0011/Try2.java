package Problem0011;

public class Try2 {
    public static int maxArea(int[] height) {
        int length = height.length;
        int i = 0;
        int j= length-1;
        int maxArea = 0;
        while(i<j){
            int leftValue= height[i];
            int rightValue = height[j];
            int b = j-i;
            int h = Math.min(leftValue,rightValue);
            int newArea= b*h;
            if(newArea>maxArea){

                maxArea= newArea;
            }
            if(leftValue<rightValue){
                i++;
            }else {
                j--;
            }

        }
        return maxArea;
    }
}