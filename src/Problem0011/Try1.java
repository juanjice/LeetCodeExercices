package Problem0011;

public class Try1 {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int lastMax =0;
        for(int i = 0 ; i<height.length; i++){
            for(int j=i+1;j<height.length;j++){
                int result = (j - i) * Math.min(height[i], height[j]);
                if(result >maxArea){
                    maxArea = result;
                }
            }
        }
        return maxArea;
    }
}
//Muere por tiempo esto es un O(n^2)

