import java.util.LinkedList;
import java.util.Queue;

public class LC_225 {
    Queue<Integer> q;

    public LC_225(){
        q=new LinkedList<>();
    }

    public void push(int x){
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
        
    }

    public int pop(){
        if(q.isEmpty()) return -1;
        return q.poll();
    }

    public int top(){
        if(q.isEmpty()) return -1;
        return q.peek();
    }
    
    public boolean Isempty(){
        return q.isEmpty();

    }
    public static void main(String[] args) {
        LC_225 obj=new LC_225();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println(obj.pop());
        System.out.println((obj.top()));
        System.out.println(obj.Isempty());
    }
} 
