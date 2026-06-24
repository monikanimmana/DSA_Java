import java.util.Stack;
import java.util.Arrays;

public class LC_503 {
    public int[] NGE2(int nums[]){
        Stack<Integer> st=new Stack<>();
        int n= nums.length;
        int res[]= new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && nums[i%n] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()){
                res[i%n]=-1;

            }else{
                res[i%n] = st.peek();
            }
            st.push(nums[i%n]);
        }
        return res;
    }
    public static void main(String[] args) {
        LC_503 obj=new LC_503();
        int nums[]=new int[]{1,2,1,1,2,1};
        System.out.println(Arrays.toString(obj.NGE2(nums)));
    }
}
