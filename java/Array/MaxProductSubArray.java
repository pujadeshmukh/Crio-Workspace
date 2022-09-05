package Array;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println("The max product of subarray is:"+getMaxProduct(nums));
    }

    private static int getMaxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int leftToRight = 1;
        int rightToLeft = 1;

        for(int i=0;i<nums.length;i++){
            leftToRight *= nums[i];
            rightToLeft *= nums[nums.length-1-i];

            max = Math.max(max, Math.max(leftToRight,rightToLeft));
        }

        return max;
    }
}
