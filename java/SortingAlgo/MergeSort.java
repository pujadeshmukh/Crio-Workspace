package SortingAlgo;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = {20,30,10,6,5,9};
        mergeSort(a,0,a.length-1);
        System.out.println("After sorting the array is");
        for(int i : a){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] a, int l, int r) {
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(a,l, mid);
            mergeSort(a,mid+1,r);
            merge(a,l,mid,r);
        }
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int[] b = new int[a.length];
        int i = l;
        int j = mid+1;
        int k = l;
        while(i<=mid && j<=r){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }else{
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if(i>mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        }else{
            while(i<=mid){
                b[k] = a[i];
                k++;
                i++;
            }
        }


        for( k=l;k<=r;k++){
            a[k] = b[k];
        }
    }
}
