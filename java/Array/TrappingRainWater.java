package Array;

public class TrappingRainWater {
    public static void main(String[] args) {
        //int a[] = {4,2,0,3,2,5};
        int a[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The maximum water consumption: "+getMaxRainWater(a));
    }

    private static int getMaxRainWater(int[] a) {
        int maxWater = 0;
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = a[0];
        right[len-1] = a[len-1];
        //Left water array
        for(int i=1;i<len;i++){
            left[i] = Math.max(left[i-1], a[i]);
        }
        for(int i=len-2;i>=0;i--){
            right[i] = Math.max(right[i+1], a[i]);
        }
        //Formula : sum of min between left & right and substract the height of that block.

        for(int i=0;i<len;i++){
            maxWater += Math.min(left[i],right[i]) - a[i];
        }
        return maxWater;
    }
}
