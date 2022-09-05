package LinkedList;

public class SortLLOf01and2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(1);
        list.addNode(2);
        list.addNode(0);
        list.addNode(2);
        list.addNode(2);
        System.out.println("Unsorted list is :");
        list.printList(list.head);
        Node sortedHead = getSortedList(list.head);
        System.out.println();
        System.out.println("Sorted list is :");
        list.printList(sortedHead);
    }

    private static Node getSortedList(Node head) {
        if(head == null){
            return null;
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        Node current = head;
        while (current != null){
            switch (current.data){
                case 0 : count0++;
                            break;
                case 1 : count1++;
                            break;
                case 2 : count2++;
                            break;
            }
            current = current.next;
        }
        current = head;
        while (current != null){
            for(int i=0;i<count0;i++){
                current.data = 0;
                current = current.next;
            }
            for(int i=0;i<count1;i++){
                current.data = 1;
                current = current.next;
            }
            for(int i=0;i<count2;i++){
                current.data = 2;
                current = current.next;
            }
        }
        return head;
    }
}
