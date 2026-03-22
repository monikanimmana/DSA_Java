package Arrays;

public class LC_1493{
    public int longestSubarray(int nums[]){
        int left =0;
        int max_subarray = 0;
        int zero_count = 0;
        int len = nums.length;
        for(int right=0;right<len;right++){
            if(nums[right]==0){
                zero_count++;
            }
            while(zero_count > 1){
                if(nums[left] == 0){
                    zero_count--;
                }
                left++;
            }
            max_subarray = Math.max(max_subarray , right-left);
        }
        return max_subarray;
    }
    public static void main(String[] args) {
        LC_1493 obj = new LC_1493();
        int nums[] = new int[]{0,1,1,1,0,1,1,0,1};
        System.out.println(obj.longestSubarray(nums));
    }
}