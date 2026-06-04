public class LC_82 {
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

    public ListNode removeduplicate(ListNode head){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while (curr!=null) {
            if(curr.next!=null && curr.data == curr.next.data){
                while (curr.next!=null && curr.data == curr.next.data) {
                    curr=curr.next;
                }
                prev.next=curr.next;
            }else{
                prev=prev.next;
            }
            curr=curr.next;
            
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        LC_82 obj=new LC_82();
        int arr[]=new int[]{1,1,1,1,2,3,3,4,5};
        ListNode head= obj.convertlist(arr);
        head=obj.removeduplicate(head);
        traversal(head);
    }

}
