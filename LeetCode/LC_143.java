import java.util.List;

public class LC_143 {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode convertlist(int[] arr){
        ListNode head=new ListNode(arr[0]);
        ListNode temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    static void traversal(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->" );
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static ListNode ReorderList(ListNode head){
        ListNode slow =head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode prev=null; 

        while(slow!=null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        ListNode first=head;
        ListNode second=prev;
      
        while(second.next!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
        return head;    
    }
    public static void main(String[] args) {
        LC_143 obj=new LC_143();
        int arr[]=new int[]{1,2,3,4,5};
        ListNode head= obj.convertlist(arr);
        head.next.next.next.next=head.next;
        head=ReorderList(head);
        traversal(head);
    }
}
