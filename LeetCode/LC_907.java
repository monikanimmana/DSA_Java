import java.util.Stack;

public class LC_907{
    public int Sum_Subarray(int arr[]){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=st.peek();
            }

            st.push(i);
        }

        st.clear();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i]=n;
            }else{
                right[i]=st.peek();
            }

            st.push(i);
        }

        int mini=0;

        for(int i=0;i<n;i++){
            int leftcount= i - left[i];
            int rightcount = right[i]-i;

            mini += arr[i] * leftcount * rightcount;
        }

        return mini;

    }
    public static void main(String[] args) {
        LC_907 obj=new LC_907();
        int arr[]=new int[]{3,1,2,4};
        System.out.println(obj.Sum_Subarray(arr));
    }
}