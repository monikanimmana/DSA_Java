public class LC_24{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    static ListNode swapnode(ListNode head){
        ListNode curr=head;
        ListNode next;
        while(curr!=null&&curr.next!=null){
            next=curr.next;

            int temp=curr.val;
            curr.val=next.val;
            next.val=temp;

            curr=next.next;
        }
        return head;
    }
}