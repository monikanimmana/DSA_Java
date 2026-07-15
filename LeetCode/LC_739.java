import java.util.Arrays;
import java.util.Stack;

public class LC_739{
    public int[] temperature(int temp[]){
        int n=temp.length;
        int days[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
                
            }

            if(st.isEmpty()){
                days[i]=0;
            }else{
                days[i] = st.peek()-i;
            }

            st.push(i);

        }
        return days;
    }
    public static void main(String[] args) {
        LC_739 obj=new LC_739();
        int temp[]=new int[]{73,74,76,72,72,69,74};
        System.out.println(Arrays.toString(obj.temperature(temp)));
    }
}