
public class lowerbound {
    public int findlower(int nums[],int n){
        int low=0;
        int high=nums.length-1;
        int result=nums[high];
        while(low<=high){
            int mid=low+high/2;
            if(nums[mid]>=n){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;

            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        lowerbound obj=new lowerbound();
        int nums[]=new int[]{1,2,3,4,5,6,7,8,8,10,11};
        int n=2;
        System.out.println(obj.findlower(nums, n));
    }
}
