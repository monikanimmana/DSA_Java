import java.util.Stack;

public class basic_stackoperations {
    int top=-1;
    public void push(int val, int[]arr,int n){
        if(top == n-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    public int Top(int arr[]){

        if(top==-1) return -1;

        return arr[top];
    }
    public void pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        } 
        top--;

    }
    public int size(){
        return top+1;
    }
    public static void main(String[] args) {
        basic_stackoperations obj=new basic_stackoperations();
        Stack<Integer> st=new Stack<>();
        int n=4;
        int arr[]=new int[n];
        obj.push(6,arr,n);
        System.out.println(obj.Top(arr));
        obj.pop();
        System.out.println(obj.size());
        
    }

    
}