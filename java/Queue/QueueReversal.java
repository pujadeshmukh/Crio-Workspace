package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        System.out.println("Original Queue: "+q);
        reverse(q);
        System.out.println("Reversed Queue: "+q);

    }

    private static void reverse(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()){
            stack.push(q.poll());
        }
        while (!stack.isEmpty()){
            q.add(stack.pop());
        }
    }
}
