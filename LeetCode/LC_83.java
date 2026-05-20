public class LC_83 {
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
    static ListNode remove_duplicateNode(ListNode head){
        if(head==null){
            return null;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(curr.data == prev.data){
                prev.next=curr.next;
            }else{
                prev=prev.next;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        LC_83 obj=new LC_83();
        int arr[]=new int[]{1,1,1,2,3,3};
        ListNode head= obj.convertlist(arr);
        traversal(head);
        head=remove_duplicateNode(head);
        traversal(head);
        
        
    }
}
