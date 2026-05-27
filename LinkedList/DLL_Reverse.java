public class DLL_Reverse {
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
    static ListNode reverseDLL(ListNode head){
        ListNode curr=head;
        ListNode temp=null;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;   
        }
        return head;
    }
    public static void main(String[] args) {
        DLL_Reverse obj=new DLL_Reverse();
        int arr[]=new int[]{1,2,3,4,5,6,7,8,9};
        DLL list=obj.creation(arr);
        ListNode head=list.head;
        ListNode tail=list.tail;
        traversalForward(head);
        head=reverseDLL(head);
        traversalForward(head);
        
    }
}
