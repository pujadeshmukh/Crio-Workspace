package DoublyLinkedList;

public class CreateDoublyLinkedList {
    Node head;
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = head;
       newNode.previous = null;
        }
       if(head != null){
           head.previous = newNode;
       }
       head = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.previous.data +"<-"+ currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        CreateDoublyLinkedList list = new CreateDoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.printList();
    }
}


