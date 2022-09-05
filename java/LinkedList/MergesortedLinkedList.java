package LinkedList;


public class MergesortedLinkedList  {

    public void createLinkedList(){
        LinkedList list1 = new LinkedList();
        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(4);
        Node head1 = list1.head;
        list1.printList(head1);
        System.out.println();
        LinkedList list2 = new LinkedList();
        list2.addNode(1);
        list2.addNode(3);
        list2.addNode(4);
        Node head2 = list2.head;
        list1.printList(head2);
        System.out.println();
        Node mergedList = getSortedMergedList(head1, head2);
        LinkedList sortedList = new LinkedList();
        System.out.println("Sorted Merged list is: ");
        sortedList.printList(mergedList);
    }

    private Node getSortedMergedList(Node head1, Node head2) {
        if(head1 == null || head2 == null){
            return head1 == null ? head2 : head1;
        }else{
            Node sortedHead;
            if(head1.data < head2.data){
                sortedHead = head1;
                head1 = head1.next;
            }else{
                sortedHead = head2;
                head2 = head2.next;
            }
            Node curr = sortedHead;
            while(head1 != null && head2 !=null){
                if(head1.data < head2.data){
                    curr.next = head1;
                    head1 = head1.next;
                }else{
                    curr.next = head2;
                    head2 = head2.next;
                }
                curr = curr.next;
            }
            curr.next = head1 == null ? head2 : head1;
            return sortedHead;
        }
    }

    public static void main(String[] args) {
        MergesortedLinkedList sort = new MergesortedLinkedList();
        sort.createLinkedList();
    }

}

