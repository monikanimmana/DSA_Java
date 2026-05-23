public class LC_92 {
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
    public ListNode reverseList(ListNode head,int left,int right){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        for(int i=0;i<right-left;i++){
            ListNode next=curr.next;
            curr.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return head;
    }
    public static void main(String[] args) {
        LC_92 obj=new LC_92();
        int arr[]=new int[]{1,2,3,4,5};
        int left=2;
        int right=4;
        ListNode head= obj.convertlist(arr);
        head=obj.reverseList(head, left, right);
        traversal(head);
        
    }

}
