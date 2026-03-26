import java.util.HashMap;

public class LC_1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
           sum += nums[i]%2;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        LC_1248 obj = new LC_1248();
        int nums[] = new int[]{2,4,6};
        int k=1;
        System.out.println(obj.numberOfSubarrays(nums,k));
    }
}

