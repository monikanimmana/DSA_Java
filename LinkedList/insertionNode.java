public class insertionNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node createnode(int []arr){
        Node head = new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }

    static void traversal(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public Node insertbegin(Node head , int data){
        if(head==null){
            head =new Node(data);
            return head;
        }
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
        return head;
    }

    public Node insertend(Node head , int data){
        if(head==null){
            head=new Node(data);
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
        return head;
    }
    public static void main(String[] args) {
        insertionNode obj=new insertionNode();
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        Node head = obj.createnode(arr);
        traversal(head);
        head=obj.insertbegin(head, 10);
        traversal(head);
        head=obj.insertend(head, 20);
        traversal(head);
    }
}
