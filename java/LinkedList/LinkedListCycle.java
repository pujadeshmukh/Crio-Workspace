package LinkedList;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedList cyclelist = new LinkedList();
        cyclelist.addNode(1);
        cyclelist.addNode(2);
        cyclelist.createCycle(3);

        if(hasCycle(cyclelist.head) == true){
            System.out.println("There is a cycle in the linked list");
        }else{
            System.out.println("No cycle exsists");
        }
    }

    private static boolean hasCycle(Node head) {
        if(head == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
