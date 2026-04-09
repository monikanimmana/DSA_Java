public class rotatedarray{
    public int findmin(int nums[]){
        int low=0;
        int high=nums.length-1;
        int min_val=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+high/2;
            if(nums[low]<nums[high]){
                min_val=Math.min(min_val, nums[low]);
                break;
            }
            if(nums[low]<=nums[mid]){
                min_val=Math.min(min_val,nums[low]);
                low=mid+1;
            }else{
                high=mid-1;
                min_val=Math.min(min_val,nums[mid]);
            }
        }
        return min_val;
    }
    public static void main(String[] args) {
        rotatedarray obj=new rotatedarray();
        int nums[]=new int[]{7,8,1,2,3,4,5,6};
        System.out.println(obj.findmin(nums));
    }
}