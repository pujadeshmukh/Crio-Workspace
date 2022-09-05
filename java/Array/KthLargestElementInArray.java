package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

//Method1 : Using priority queue
//Method2 : Using sorting
public class KthLargestElementInArray {
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println("The "+k+" largest element in the array using priority queue is:"+getKLargestElement(nums,k));
        System.out.println("The "+k+" largest element in the array using sorting is:"+getLargestNumber(nums,k));
    }

    //Method1
    private static int getKLargestElement(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int getLargestNumber(int[] nums, int k){
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length-k];
    }
}
