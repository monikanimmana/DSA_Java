import java.util.Stack;
public class LC_155 {
    Stack<Integer> st;
    Stack<Integer> stmin;

    public void minStack(){
        st=new Stack<>();
        stmin=new Stack<>();
    }

    public void push(int value){
        st.push(value);

        if(stmin.isEmpty()){
            stmin.push(value);
        }else{
            stmin.push(Math.min(value , stmin.peek()));
        }
        
    }

    public void pop(){
        if(!st.isEmpty()){
            stmin.pop();
            st.pop();
        }
    }

    public int top(){
        if(st.isEmpty()) return -1;
        return st.peek();
    }

    public int getMin(){
        if(stmin.isEmpty()) return -1;
        return stmin.peek();
        

    }

    public static void main(String[] args) {
        LC_155 obj=new LC_155();
        obj.minStack();
       
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }

}
