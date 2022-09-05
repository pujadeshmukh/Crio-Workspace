package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstK {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        System.out.println("Original q :" +q);
        int k=4 ;
        reverseK(q,k);
        System.out.println("after reversal of k elements: "+q);
    }

    private static void reverseK(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.peek());
            q.poll();
        }
        while (!stack.isEmpty()){
            q.add(stack.peek());
            stack.pop();
        }
        for(int i=0;i<q.size()-k;i++){
            q.add(q.peek());
            q.remove();
        }
    }
}
