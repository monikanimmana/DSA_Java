public class LC_21 {
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
    public ListNode mergeList(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(-1);
        ListNode ans=dummy;
        ListNode curr1=list1;
        ListNode curr2=list2;
        while(curr1!=null && curr2!=null){
            if(curr1.data<=curr2.data){
                ans.next=curr1;
                ans=ans.next;
                curr1=curr1.next;
            }else{
                ans.next=curr2;
                ans=ans.next;
                curr2=curr2.next;
            }
        }
        if(curr1!=null){
            ans.next=curr1;
        }
        if(curr2!=null){
            ans.next=curr2;
        }
        return dummy.next;

    }
    public static void main(String[] args) {
        LC_21 obj=new LC_21();
        int arr1[]=new int[]{1,2,3};
        int arr2[]=new int[]{1,3,4};
        ListNode list1= obj.convertlist(arr1);
        ListNode list2= obj.convertlist(arr2);
        traversal(list1);
        traversal(list2);
        ListNode head=obj.mergeList(list1,list2);
        traversal(head);
    }

}
