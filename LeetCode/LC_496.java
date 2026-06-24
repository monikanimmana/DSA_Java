import java.util.HashMap;
import java.util.Stack;
import java.util.Arrays;

public class LC_496{
    public int[] NGE1(int[] nums1 , int[] nums2){
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums1.length];

        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();

            }
            if(st.isEmpty()){
                map.put(nums2[i],-1);
            }else{
                map.put(nums2[i],st.peek());
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;

    }
    public static void main(String[] args) {
        LC_496 obj=new LC_496();
        int[] nums1=new int[]{4,3,1};
        int[] nums2=new int[]{1,2,3,4,5,6,1,2,5,8};
        System.out.println(Arrays.toString(obj.NGE1(nums1, nums2)));

    }
}