
public class deletionNode{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public Node convertto(int []arr){
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
        System.out.println();
    }

    static Node deleteHead(Node head){
        if(head==null){
            return null;
        }
        head=head.next;
        return head;
    }

    static Node deleteTail(Node head){
        Node temp=head;
        if(head == null || head.next==null){
            return null;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    
    static Node deletePosition(Node head , int k){
        if(head == null){
            return null;
        }
        if(k==0){
            head=head.next;
            return head;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count == k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;

    }
    static Node deletionValue(Node head , int value){
        if(head==null){
            return null;
        }
        if(head.data==value){
            return head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data == value){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        deletionNode obj=new deletionNode();
        int []arr=new int[]{1,2,3,4,5,6,7,8};
        Node head = obj.convertto(arr);
        head = deleteHead(head);
        traversal(head);
        deleteTail(head);
        traversal(head);
        deletePosition(head, 3);
        traversal(head);
        deletionValue(head , 7);
        traversal(head);

    }
}