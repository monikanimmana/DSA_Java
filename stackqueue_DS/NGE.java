import java.util.*;

public class NGE {
    public int[] nextgreaterelement(int []arr){
        Stack<Integer> st=new Stack<>();
        int res[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                 res[i] = -1;
            }else{
                res[i]=st.peek();
            } 
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        NGE obj=new NGE();
        int arr[]=new int[]{4,12,5,6,3,2,1,5,3,2,1,4,5,6};
        System.out.println(Arrays.toString(obj.nextgreaterelement(arr)));
    }
}
