public class LC_142 {
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
    static ListNode cycleList2(ListNode head){
        ListNode curr = head;
        ListNode next = head;
        while(next!=null && next.next!=null){
            curr=curr.next;
            next=next.next.next;
            if(curr == next){
                break;
                     
            }
        }
        if(next==null || next.next==null){
            return null;
        }
        ListNode temp=head;
        while(temp!=curr){
            temp=temp.next;
            curr=curr.next; 
        }
        return temp;
          
    }
    public static void main(String[] args) {
        LC_142 obj=new LC_142();
        int arr[]=new int[]{1,2,3,4,5};
        ListNode head= obj.convertlist(arr);
        head.next.next.next.next=head.next;
        System.out.println(cycleList2(head));
        
    }
}




