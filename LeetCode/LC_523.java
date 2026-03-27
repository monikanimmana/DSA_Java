import java.util.HashMap;

public class LC_523 {
    public boolean checkSubarraySum(int arr[] , int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int rem =sum%k;
            if(map.containsKey(rem)){

                if(i-map.get(rem)>=2){
                    return true;
                }
            }else{
            map.put(rem,i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LC_523 obj = new LC_523();
        int arr[] = new int[]{23,2,4,6,7};
        int k=6;
        System.out.println(obj.checkSubarraySum(arr, k));
    }
}
