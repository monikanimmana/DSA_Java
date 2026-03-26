import java.util.HashMap;

public class LC_525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum =0;
        int n = nums.length;
        int length=0;
        int max_length=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum+=(-1);
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                length=i-(map.get(sum));
                max_length=Math.max(max_length,length);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
           

        }
        return max_length;
    }
    public static void main(String[] args) {
        LC_525 obj = new LC_525();
        int nums[] = new int[]{0,1,0};
        System.out.println(obj.findMaxLength(nums));
    }
}

