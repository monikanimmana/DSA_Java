public class DLL_deletion {
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
    public DLL creationDLL(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode tail=head;
        for(int i=1;i<arr.length;i++){
            ListNode newnode = new ListNode(arr[i]);
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        return new DLL(head , tail);
    }
    static void traversalForword(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.print(curr.val + "->");
            curr=curr.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static void traversalBackword(ListNode tail){
        ListNode curr=tail;
        while(curr!=null){
            System.out.print(curr.val +"->");
            curr=curr.prev;
        }
        System.out.print("null");
        System.out.println();
    }
    static ListNode deleteBegin(ListNode head){
        if(head == null || head.next==null) return null;
        head=head.next;
        return head;
    }
    static ListNode deleteEnd(ListNode tail,ListNode head){
        if(head==null) return null;
        tail=tail.prev;
        tail.next=null;
        return tail;
    }
    static ListNode deleteMiddle(ListNode head ,int node){
        if(head==null)  return null;
        ListNode curr=head;
        int count=0;
        while(curr!=null && count!=node){
            count++;
            curr=curr.next;
        }
        if(curr==null) return head;
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
        return head;
    }
    static ListNode deleteValue(ListNode head , int value){
        ListNode curr=head;
        while(curr!=null && curr.val!=value){
            curr=curr.next;
        }
        if(curr==null) return null;
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
        return head;
    }
    public static void main(String[] args) {
        DLL_deletion obj=new DLL_deletion();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        DLL list=obj.creationDLL(arr);
        ListNode head=list.head;
        ListNode tail=list.tail;
        traversalForword(head);
        head=deleteBegin(head);
        traversalForword(head); 
        tail=deleteEnd(tail, head);
        traversalBackword(tail);
        head=deleteMiddle(head, 4);
        traversalForword(head);
        head=deleteValue(head, 5);
        traversalForword(head);   
    }
}
