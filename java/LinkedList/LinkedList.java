package LinkedList;

public class LinkedList {
     Node head;
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node currnode = head;
            while(currnode.next != null){
                currnode = currnode.next;
            }
            currnode.next = newNode;
        }
    }

    public void printList(Node head){
        if(head == null){
            System.out.println("Empty list");
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("Null");
    }

    public void createCycle(int data){
        if(head == null){
            System.out.println("Empty list");
        }
        Node newnode = new Node(data);
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = head;
    }
}
