package Array;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int[] product = getProductExceptSelf(nums);
        System.out.println("The product of array elements except self is: ");
        for(int i: product){
            System.out.print(i+", ");
        }
    }

    private static int[] getProductExceptSelf(int[] nums) {

        int len = nums.length;
        int[] leftProduct = new int[len];
        int[] rightProduct = new int[len];
        int[] ans = new int[len];
        if(nums.length == 1){
            ans[0] = nums[0];
            return ans;
        }
        int product = 1;

        for(int i=0;i<len;i++){
            product *= nums[i];
            leftProduct[i] = product;
        }
        product = 1;
        for(int i=len-1;i>=0;i--){
            product *= nums[i];
            rightProduct[i] = product;
        }

        for(int i=0;i<len;i++){
            if(i==0){
                ans[i] = rightProduct[i+1];
            }else if(i==len-1){
                ans[i] = leftProduct[i-1];
            }else{
                ans[i] = rightProduct[i+1] * leftProduct[i-1];
            }
        }

        return ans;
    }
}
