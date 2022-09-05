package Array;

public class MaxMinInArray {
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        System.out.println("Max Element is:"+getMaxElement(arr));
        System.out.println("Min Element is:"+getMinElement(arr));
    }

    private static int getMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int getMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
