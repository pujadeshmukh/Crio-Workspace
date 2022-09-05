package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = getTriplet(a);
        for(List list : ans){
            System.out.println(list);
        }
    }

    private static List<List<Integer>> getTriplet(int[] a) {
        Arrays.sort(a);
        int n = a.length-1;
        for(int i=0;i<n-2;i++){
            if(i==0 || a[i] != a[i-1]){
                sortedTwoSum(i+1,n,a,0-a[i]);
            }
        }
        return result;
    }
    private static void sortedTwoSum(int i, int j, int[] a, int target){
        int a1 = a[i-1];

        while(i<j){
            int sum = a[i] + a[j];
            if(sum > target){
                j--;
            }else if(sum < target){
                i++;
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(a1);
                list.add(a[i]);
                list.add(a[j]);
                result.add(list);
                --j;
                while(i<j && a[j]==a[j+1]){
                    --j;
                }
            }
        }
    }
}
