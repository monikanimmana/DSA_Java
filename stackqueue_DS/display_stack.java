public class display_stack {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    int size=0;
    public void push(int data){
        Node newnode=new Node(data);
        Node prev=null;
        prev=top;
        top=newnode;
        top.next=prev;
        size++;
    }
    

}
