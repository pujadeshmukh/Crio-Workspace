package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromUnsortedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(1);
        list.addNode(3);

        Node uniqueHead = getUniqueNodeList(list.head);
        list.printList(uniqueHead);

    }

    private static Node getUniqueNodeList(Node head) {
        if(head == null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        Node previous = null;
        Node current = head;

        while (current != null){
            int currentVal = current.data;
            if(set.contains(currentVal)){
                previous.next = current.next;
            }else{
                set.add(currentVal);
                previous = current;
            }
            current =current.next;
        }

        return head;
    }
}
