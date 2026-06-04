public class LC_61 {
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head; 
        ListNode last=head;
        int size=1;
        while(last.next!=null){
            last=last.next;
            size++;
        }
        k=k%size;
        if(k==0) return head;
        int n=size-k;

        last.next=head;

        ListNode newTail=head;

        for(int i=1;i<n;i++){
            newTail = newTail.next;
        }

        ListNode newHead=newTail.next;
        newTail.next=null;

        return newHead;
        
        
        
    }
    public static void main(String[] args) {
        LC_61 obj=new LC_61();
        int arr[]=new int[]{1,2,3,4,5};
        int k=2;
        ListNode head= obj.convertlist(arr);
        head=obj.rotateRight(head,k);
        traversal(head);

    }
}
