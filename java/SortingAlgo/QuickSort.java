package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3};
        quickSort(a,0,a.length-1);
        System.out.println("After sorting the array is : ");
        for(int i : a){
            System.out.print(i +" ");
        }
    }

    private static void quickSort(int[] a,int l, int r) {
        if(l<r){
            int pivot = partition(a,l,r);
            quickSort(a,l,pivot-1);
            quickSort(a,pivot+1,r);
        }
    }

    private static int partition(int[] a, int l, int r) {
        int pivot = a[l];
        int i = l;
        int j = r;
        while(i < j){
            while(a[i] <= pivot){
                i++;
            }
            while(a[j] > pivot){
                j--;
            }
            if(i < j){
                swap(a,i,j);
            }
        }
        swap(a,j,l);
        return j;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
