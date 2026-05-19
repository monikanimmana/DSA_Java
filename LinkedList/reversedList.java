public class reversedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node convertlist(int []arr){
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
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    static Node reversed(Node head){
        Node prev=null;
        Node curr = head;
        while(curr!=null){
            Node next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        reversedList obj=new reversedList();
        int arr[]=new int[]{1,2,3,4,5};
        Node head=obj.convertlist(arr);
        traversal(head);
        head = reversed(head);
        traversal(head);
    }
}
