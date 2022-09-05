package Array;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int searchElement = 3;
        System.out.println("The element is found at:"+search(nums,searchElement));
    }

    public static int search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (isSorted(nums,start,mid)) {
                if(target>=nums[start] && target< nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            if (isSorted(nums,mid,end)){
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    private static boolean isSorted(int[] nums, int start, int end){
        boolean ans = false;
        for(int i=start;i<end;i++){
            if(nums[i]<nums[i+1]){
                ans = true;
            }else{
                ans = false;
                break;
            }
        }
        return ans;
    }
}
