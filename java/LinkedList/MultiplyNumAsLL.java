package LinkedList;

public class MultiplyNumAsLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(9);
        list.addNode(4);
        list.addNode(6);
        LinkedList list2 = new LinkedList();
        list2.addNode(8);
        list2.addNode(4);

        System.out.println("Multiplication is: "+getProduct(list.head,list2.head));
    }

    private static int getProduct(Node head, Node head1) {
        int num1 = 0;
        int num2 = 0;

        while (head != null){
           num1 = num1*10 + head.data;
           head = head.next;
        }
        System.out.println("num1 is: "+num1);
        while (head1 != null){
            num2 = num2*10 + head1.data;
            head1 = head1.next;
        }
        System.out.println("num2 is: "+num2);
        return num1 * num2;
    }
}
