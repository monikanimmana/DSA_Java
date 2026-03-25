
import java.util.HashMap;

public class LC_560 {
    public int subarraySum(int arr[] , int k){
        HashMap<Integer , Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        int n = arr.length;
        map.put(0,1); 
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }
            map.put(sum , map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        LC_560 obj = new LC_560();
        int arr[] =  new int[]{1,2,3};
        int k =3;
        System.out.println(obj.subarraySum(arr, k));
    }
}
