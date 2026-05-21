public class LC_160 {
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
    static int traversal(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    static ListNode insectionList(ListNode list1,ListNode list2){
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1!=temp2){
            temp1=(temp1==null)?list2:temp1.next;
            temp2=(temp2==null)?list1:temp2.next;
        }
        return temp1;
    }
    
}
