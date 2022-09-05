package LinkedList;

public class RemoveNthNodefromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i=1;i<=5;i++){
            list.addNode(i);
        }
        System.out.println("Original list ");
        list.printList(list.head);
        int k=2;
        Node newHead = getNewList(list.head,k);
        System.out.println("New list");
        System.out.println();
        list.printList(newHead);

    }

    private static Node getNewList(Node head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        Node fast = head;
        Node slow = head;

        for(int i=0;i<=k+1;i++){
            fast = fast.next;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
