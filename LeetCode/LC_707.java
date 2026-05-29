public class LC_707 {
    class MyLinkedList{
        class ListNode{
            int val;
            ListNode prev;
            ListNode next;
            ListNode(int val){
                this.val=val;
            }
        }

        ListNode head;
        ListNode tail;
        int size;

        public MyLinkedList(){
            head=null;
            tail=null; 
            size=0;   
        }
    
        public int get(int index){
            if(index<0 || index>=size) return -1;
            ListNode curr=head;
            int count=0;
            while(curr!=null && count!=index){
                count++;
                curr=curr.next;
            }
            if(curr==null) return -1;
            return curr.val;   
        }
        
        public void addAtHead(int val) {
            ListNode newnode=new ListNode(val);
            if(head==null){
                head=tail=newnode;
            }else{
                newnode.next=head;
                head.prev=newnode;
                head=newnode;
            }
            size++;
        }
        
        public void addAtTail(int val) {
            ListNode newnode=new ListNode(val);
            if(tail==null){
                head=tail=newnode;
            }else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }
            size++;   
        }
        
        public void addAtIndex(int index, int val) {
            ListNode newnode=new ListNode(val);
            if(index<0 || index>size) return;
            if(index==0){
                addAtHead(val);
                return;
            }
            if(index==size){
                addAtTail(val);
                return;
            }
            int count=0;
            ListNode curr=head;
            while(curr!=null &&count!=index){
                count++;
                curr=curr.next;
            }
            
            newnode.prev = curr.prev;
            newnode.next = curr;

            curr.prev.next = newnode;
            curr.prev = newnode;
            size++;   
        }
        
        public void deleteAtIndex(int index) {
            if(index<0 || index>=size) return;
            if(index==0){
                if(size==1){
                    head=tail=null;
                }else{
                    head=head.next;
                    head.prev=null;
                }
                size--;
                return;
            } 
            if(index==size-1){
                tail=tail.prev;
                tail.next=null;
                size--;
                return;
            }
            ListNode curr=head;
            int count=0;
            while(curr!=null&&count!=index){
                count++;
                curr=curr.next;
            }
            curr.next.prev=curr.prev;
            curr.prev.next=curr.next;
            size--;   
        }
    }

}
