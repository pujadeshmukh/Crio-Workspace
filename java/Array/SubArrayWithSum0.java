package Array;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithSum0 {
    public static void main(String[] args) {
        int arr[] = {4,2,-2,5};
        if(isSumZero(arr)==true){
            System.out.println("There exsists a subarray with sum 0");
        }else{
            System.out.println("No subarray with sum 0");
        }
    }

    private static boolean isSumZero(int[] arr) {
        int currSum = 0;
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(arr[i]==0 || currSum ==0 ||set.contains(currSum)){
                result = true;
                break;
            }else{
                set.add(currSum);
                result = false;
            }
        }
        return result;
    }
}
