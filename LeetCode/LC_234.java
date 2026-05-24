public class LC_234{
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

    public boolean palindromList(ListNode head){
        if(head == null|| head.next==null) return true;
    
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode curr;
        if(fast!=null){
            curr=slow.next;
            slow.next=null;
        }else{
            curr=slow;
        }
        ListNode prev=null;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode first=head;
        ListNode last=prev;
        while(last!=null){
            if(first.val != last.val){
                return false;
            }
            first=first.next;
            last=last.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LC_234 obj=new LC_234();
        int []arr=new int[]{1,6,3,6,1};
        ListNode head = obj.convertto(arr);
        traversal(head);
        System.out.print(obj.palindromList(head));
    }

    
}