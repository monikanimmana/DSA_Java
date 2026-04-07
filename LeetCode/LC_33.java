public class LC_33{
    public int findtarget(int nums[],int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[left] <= nums[mid]){

                if(nums[left]<= target && target < nums[mid]){
                    right=mid-1;

                }else{
                    left=mid+1;
                }

                
            }else{

                if(nums[mid] <= target && target < nums[right]){
                    left=mid+1;

                }else{
                    right=mid-1;
                }
            
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LC_33 obj=new LC_33();
        int nums[] = new int[]{4,5,6,0,1,2};
        int target=3;
        System.out.println(obj.findtarget(nums, target));
    }
}