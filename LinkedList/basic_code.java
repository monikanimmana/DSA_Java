public class basic_code{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        System.out.println(n1.data);

    }
}