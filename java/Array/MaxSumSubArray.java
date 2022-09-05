package Array;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int nums[] = {100,200,300,400};
        int k=3;
        System.out.println("The maximum sum of subarray of window of size "+k+"is : "+getMaxSum(nums,k));
    }

    private static int getMaxSum(int[] nums,int k) {
        int windowSum = 0;
        int maxSum = 0;

        for(int i=0;i<k;i++){
            windowSum += nums[i];
            maxSum = Math.max(windowSum,maxSum);
        }

        for(int j=k;j<nums.length;j++){
            windowSum += nums[j] - nums[j-k];
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum;
    }
}
