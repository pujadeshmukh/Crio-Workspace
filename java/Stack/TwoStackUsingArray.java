package Stack;

public class TwoStackUsingArray {
    int[] arr = new int[100];
    int top1 = -1;
    int top2 = arr.length;

    public  void pop2() {
        if(top2 == arr.length){
            System.out.println("Stack underflow");
            return;
        }else{
            System.out.println("Element popped:"+arr[top2]);
            top2++;
        }
    }

    public  void pop1() {
        if(top1 == -1){
            System.out.println("Stack underflow");
            return;
        }else{
            System.out.println("Element popped:"+arr[top1]);
            top1--;
        }

    }

    public  void push2(int i) {
        if(top1+1 == top2){
            System.out.println("Stack overflow");
        }else{
            top2--;
            arr[top2] = i;
        }
    }

    public  void push1(int i) {
        if(top1 + 1 == top2){
            System.out.println("Stack overflow");
        }else{
            top1++;
            arr[top1] = i;
        }
    }
}

class StackOperations{
    public static void main(String[] args) {
        TwoStackUsingArray stack = new TwoStackUsingArray();
        stack.push1(2);
        stack.push1(3);
        stack.push2(4);
        stack.pop1();
        stack.pop2();
        stack.pop2();
    }
}
