import java.util.Arrays;
import java.util.Stack;
public class LC_901{
    public int[] spanStock(int arr[]){
        int n= arr.length;
        int span[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                span[i]= i+1;
            }else{
                span[i] = i - st.peek();
            }

            st.push(i);
        }

        return span;

    }
    public static void main(String[] args) {
        LC_901 obj=new LC_901();
        int arr[] = new int[]{100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(obj.spanStock(arr)));
    }

}