class LC_237{
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public void removenode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;

    }
}