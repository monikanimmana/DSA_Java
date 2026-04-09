public class rotationarray {
    public int findrotations(int nums[]){
        int low=0;
        int high=nums.length-1;
        int min_val=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=low+high/2;
            if(nums[low]<nums[high]){
                if(nums[low]<min_val){
                    min_val=nums[low];
                    index=low;
                    break;
                }
                
            }
            if(nums[low]<=nums[mid]){
                 if(nums[low]<min_val){
                    min_val=nums[low];
                    index=low;
                }
                low=mid+1;
            }else{
                high=mid-1;
                if(nums[mid]<min_val){
                    min_val=nums[mid];
                    index=mid;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        rotationarray obj=new rotationarray();
        int nums[]=new int[]{7,8,1,2,3,4,5,6};
        System.out.println(obj.findrotations(nums));
    }
}
