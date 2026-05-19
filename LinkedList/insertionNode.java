public class insertionNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        Node head;
        Node tail;

        private void printList(Node head){
            Node newnode=new Node();
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            tail.next=newnode;
            
        }
    }
}
