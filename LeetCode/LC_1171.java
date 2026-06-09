import java.util.HashMap;

class LC_1171{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode remove(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy=head;
        HashMap<Integer, ListNode> map=new HashMap<>();
        int prefix=0;
        ListNode curr = dummy;
        while(curr!=null){
            prefix += curr.val;
            map.put(prefix , curr);
            curr=curr.next;
        }
        prefix=0;
        curr=dummy;
        while(curr!=null){
            prefix +=curr.val;
            curr.next = map.get(prefix).next;
            curr=curr.next;
        }
        return dummy.next;

    }
}