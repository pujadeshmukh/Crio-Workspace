package Array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.DelayQueue;

//Get the max element for each window of size k
public class SlidingWindowMax {
    public static void main(String[] args) {
        int a[] = {1,3,1,2,0,5};
        int k = 3;
        int ans[] = getMaxOfWindow(a,k);
        for(int i : ans){
            System.out.println(i);
        }
    }

    private static int[] getMaxOfWindow(int[] a, int k) {
        int aLen = a.length;
        int[] maxWindow = new int[aLen-k+1];
        int ptr = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<a.length;i++){
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }
            while (!q.isEmpty() && a[q.peekLast()]<a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1){
                maxWindow[ptr++] = a[q.peek()];
            }
        }
        return maxWindow;
    }
}
