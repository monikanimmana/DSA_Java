import java.util.Arrays;
class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public class deletionNode{

    static Node convertto(int []arr){
        if(arr.length==0){
            return null;
        }
        Node head=new Node(arr[0]);
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
            System.out.print(temp.data + " --> ");
            temp=temp.next;
        }

        System.out.print("null");

    }

    static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    static Node deleteTail()

    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4};
        Node head = convertto(arr);
        head = deleteHead(head);
        traversal(head);

    }
}