public class LC_1760{
    public int minSize(int nums[], int maxoperations){
        int low=1;
        int high=0;
        for(int i:nums){
            high=Math.max(high, i);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(maxballs(nums, mid, maxoperations)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean maxballs(int nums[] , int ballcount , int maxoperations){
        int operation=0;
        for(int i=0;i<nums.length;i++){
            operation+=(nums[i]-1)/ballcount;

            if(operation>maxoperations){
                return false
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LC_1760 obj=new LC_1760();
        int nums[]=new int[]{9};
        int maxoperations=2;
        System.out.println(obj.minSize(nums, maxoperations));
    }
}