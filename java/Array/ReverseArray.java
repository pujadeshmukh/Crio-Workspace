package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int reversedArr[] = reverse(arr);
        System.out.println("The reversed array is:");
        for(int i : reversedArr){
            System.out.print(i+" ");
        }
    }

    public static int[] reverse(int arr[]){
        int reversedArr[] = new int[arr.length];
        int length = arr.length;
        int temp = 0;
        for(int i=length-1;i>=0;i--){
            reversedArr[temp] = arr[i];
            temp++;
        }
        return reversedArr;
    }
}
