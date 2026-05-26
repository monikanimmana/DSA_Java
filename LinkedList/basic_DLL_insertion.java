public class basic_DLL_insertion{
    class DLL{
        ListNode head;
        ListNode tail;
        DLL(ListNode head , ListNode tail){
            this.head=head;
            this.tail=tail;
        }
    }
    class ListNode{
        int val;
        ListNode prev;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public DLL creation(int arr[]){
        ListNode head=new ListNode(arr[0]);
        ListNode tail=head;
        for(int i=1;i<arr.length;i++){
            ListNode newnode=new ListNode(arr[i]);
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        return new DLL(head,tail);
    }
    static void traversalForward(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val + "->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static void traversalBackward(ListNode tail){
        ListNode curr=tail;
        while(curr!=null){
            System.out.print(curr.val + "->");
            curr=curr.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    public ListNode insertBegin(ListNode head,int val){
        ListNode newnode=new ListNode(val);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return head;    
    }
    public ListNode insertEnd(ListNode tail,int val){
        ListNode newnode=new ListNode(val);
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        return tail;
    }
    public ListNode insertMiddle(ListNode head,int val,int node){
        if(head==null) return head;
        ListNode curr=head;
        ListNode newnode=new ListNode(val);
        int count=0;
        while(count != node && curr!=null){
            count++;
            curr=curr.next;
        }
        newnode.next=curr.next;
        if(curr.next!=null){
            curr.next.prev=newnode;
        }
        curr.next=newnode;
        newnode.prev=curr;
        return head;
    }
    public ListNode insertByValue(ListNode head , int val , int data){
        if(head==null) return null;
        ListNode curr=head;
        ListNode newnode=new ListNode(val);
        while(curr.val!=data && curr!=null){
            curr=curr.next;
        }
        newnode.next=curr.next;
        if(curr.next!=null){
            curr.next.prev=newnode;
        }
        curr.next=newnode;
        newnode.prev=curr;
        return head;
    }
    public static void main(String[] args) {
        basic_DLL_insertion obj=new basic_DLL_insertion();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        DLL list=obj.creation(arr);
        ListNode head=list.head;
        ListNode tail=list.tail;
        traversalForward(head);
        traversalBackward(tail);
        head=obj.insertBegin(head,10);
        traversalForward(head);
        tail=obj.insertEnd(tail, 20);
        traversalBackward(tail);
        head=obj.insertMiddle(head, 30,4);
        traversalForward(head);
        head=obj.insertByValue(head, 40, 8);
        traversalForward(head);
    }
}