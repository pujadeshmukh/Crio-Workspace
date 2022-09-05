package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.printList(list.head);

        System.out.println();
        System.out.println("The reversed linked list is");
        list.printList(reverseLinkedList(list.head));
    }

    private static Node reverseLinkedList(Node head) {
        if(head == null){
            System.out.println("Empty list");
        }
        Node prev = null;
        Node current = head;
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;
        return head;
    }
}
