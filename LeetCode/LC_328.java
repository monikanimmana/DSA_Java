public class LC_328{
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
    static ListNode EvenOddList(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=even;
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

    public static void main(String[] args) {
        LC_328 obj=new LC_328();
        int []arr=new int[]{1,2,3,4,5,6};
        ListNode head = obj.convertto(arr);
        traversal(head);
        head=EvenOddList(head);
        traversal(head);
    }
}