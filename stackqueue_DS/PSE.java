import java.util.Arrays;
import java.util.Stack;

public class PSE{
    public int[] findelement(int arr[]){
        int n = arr.length;
        int pse[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){

            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }

            pse[i] =(st.isEmpty())?-1 : st.peek();

            st.push(arr[i]);

        }
        return pse;
    }
    public static void main(String[] args) {
        PSE obj=new PSE();
        int arr[]=new int[]{2,4,1,6,8,5,9,5,3,2};
        System.out.println(Arrays.toString(obj.findelement(arr)));
    }
}