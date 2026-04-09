public class LC_154 {
    public int findMin(int nums[]){
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid= low +(high-low)/2;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                continue;
            }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        LC_154 obj=new LC_154();
        int nums[]=new int[]{2,2,2,0,1,2};
        System.out.println(obj.findMin(nums));
    }
}
