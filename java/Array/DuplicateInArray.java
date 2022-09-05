package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,0};
        if(containsDuplicate(nums)==false){
            System.out.println("Array contains duplicate numbers");
        }else{
            System.out.println("Array contains unique numbers");
        }
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return false;
            }else{
                set.add(nums[i]);
            }
        }
        return true;
    }
}
