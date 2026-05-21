public class LC_2{
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
    public ListNode AddList(ListNode headA,ListNode headB){
        ListNode result=new ListNode(0);
        ListNode temp=result;
        int carry=0;
        while(headA!=null || headB!=null || carry!=0){
            int val1=(headA!=null)?headA.data:0;
            int val2=(headB!=null)?headB.data:0;
            int sum=val1+val2+carry;
            carry=sum/10;
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            if(headA!=null){
                headA=headA.next;
            }
            if(headB!=null){
                headB=headB.next;
            }
            
        }
        return result.next;

    }
    public static void main(String[] args) {
        LC_2 obj=new LC_2();
        int arr1[]=new int[]{1,2,3,4,5};
        int arr2[]=new int[]{2,3,5,6,7};
        ListNode list1= obj.convertlist(arr1);
        traversal(list1);
        ListNode list2=obj.convertlist(arr2);
        ListNode head=obj.AddList(list1,list2);
        traversal(head);
    }
}
