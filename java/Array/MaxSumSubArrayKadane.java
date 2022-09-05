package Array;

public class MaxSumSubArrayKadane {
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum sum of subarray is:"+getMaxSumSubArray(arr));
    }

    private static int getMaxSumSubArray(int[] arr) {
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(sum > maxValue){
                maxValue = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxValue;
    }
}
