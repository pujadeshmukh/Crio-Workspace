package Array;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        int a[] = {3,1,2,5,3};
        int[] ans = getMissingNumber(a);
        for(int i:ans){
            System.out.println(i);
        }
    }

    private static int[] getMissingNumber(int[] a) {
        int[] ans = new int[2];
        int[] check = new int[a.length+1];
        for(int i=0;i<a.length;i++){
            check[a[i]]++;
        }
        for(int i=0;i<check.length;i++){
            if(check[i] ==2){
                ans[0] = i;
            }
            if(check[i] == 0 && i!=0){
                ans[1] = i;
            }
        }
        return ans;
    }
}
