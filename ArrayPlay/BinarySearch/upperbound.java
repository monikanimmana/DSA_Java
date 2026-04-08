package BinarySearch;

public class upperbound {
    public int findupper(int nums[],int n){
        int low=0;
        int high=nums.length-1;
        int result=nums[high];
        while(low<=high){
            int mid=low+high/2;
            if(nums[mid]>=n){
                result=mid;
                low=mid+1;

            }else{
                high=mid-1;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        upperbound obj = new upperbound();
        int nums[] = new int[]{1,2,3,4,5,6,7,8,8,9,10};
        int n=9;
        System.out.println(obj.findupper(nums, n));
    }
    
}
