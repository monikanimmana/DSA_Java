public class LC_430{
    class Node{
        int data;
        Node prev;
        Node next;
        Node child;
        Node(int data){
            this.data=data;
        }
    }
    public Node flatten(Node head) {
        if (head == null) return null;

        flattenDFS(head);
        return head;
    }

    private Node flattenDFS(Node head) {
        Node curr = head;
        Node last = null;

        while (curr != null) {
            Node next = curr.next;

            if (curr.child != null) {

                Node childHead = curr.child;
                Node childTail = flattenDFS(childHead);

                curr.next = childHead;
                childHead.prev = curr;
                curr.child = null;

                if (next != null) {
                    childTail.next = next;
                    next.prev = childTail;
                }

                last = childTail;
            } else {
                last = curr;
            }

            curr = next;
        }

        return last;
    }
}