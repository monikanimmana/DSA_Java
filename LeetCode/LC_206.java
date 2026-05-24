public class LC_206{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode convertto(int []arr){
        if(arr.length==0){
            return null;
        }
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
            System.out.print(temp.val + " --> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }


    public static void main(String[] args) {
        LC_206 obj=new LC_206();
        int []arr=new int[]{1,6,6,7};
        ListNode head = obj.convertto(arr);
        traversal(head);
        head=obj.reverseList(head);
        traversal(head);


    }
}