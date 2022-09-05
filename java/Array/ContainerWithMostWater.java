package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
            int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,1};
        System.out.println("The maximum water that container can store is: "+getMaxWater(height));
    }

    private static int getMaxWater(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = Integer.MIN_VALUE;

        while(left < right){
            int width = right - left;
            int containerHeight = Math.min(height[left],height[right]);
            int area = width * containerHeight;
            maxWater = Math.max(area, maxWater);

            if(containerHeight == height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxWater;
    }
}
