package LinkedList;



public class DeleteNodeWithoutHead {
    void createList(){
        LinkedList list = new LinkedList();
       for(int i=1;i<=5;i++){
          list.addNode(i);
       }
       System.out.println("Without delete");
       list.printList(list.head);

       int nodeValue = 4;
       Node del=null;
       Node curr = list.head;
       while(curr != null){
           if(curr.data == nodeValue){
               del = curr;
               break;
           }
           curr = curr.next;
       }
       deleteNodewithValue(del);
        System.out.println();
        System.out.println("After delete");
        list.printList(list.head);
   }

    private void deleteNodewithValue(Node deleteNode) {
        Node previous = null;
        while(deleteNode.next != null){
            previous = deleteNode;
            deleteNode.data = deleteNode.next.data;
            deleteNode = deleteNode.next;
        }
        previous.next = null;

    }

    public static void main(String[] args) {
        DeleteNodeWithoutHead list = new DeleteNodeWithoutHead();
        list.createList();
    }
}
