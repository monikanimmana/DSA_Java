

public class LC_203 {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public ListNode deletionValue(int val , ListNode head){
        if(head==null){
            return null;
        }
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                 prev=temp;
                temp=temp.next;

            }
           
        }
        return head;
    
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

    public static void main(String[] args) {
        LC_203 obj=new LC_203();
        int []arr=new int[]{1,6,6,7};
        ListNode head = obj.convertto(arr);
        traversal(head);
        head=obj.deletionValue(6,head);
        traversal(head);


    }
}
