import java.util.Arrays;

public class LC_34 {
    public int[] searchRange(int nums[] , int target){
         int first_index=FindPosition(nums, true, target);
         int last_index=FindPosition(nums, false, target);

         return new int[]{first_index,last_index};
    }
    public int FindPosition(int nums[], boolean findIndex , int target){
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=left + (right - left)/2;
            if(nums[mid]==target){
                index=mid;
                if(findIndex){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return index;

    }
    public static void main(String[] args) {
        LC_34 obj=new LC_34();
        int nums[] = new int[]{5,8,8,8,8,9};
        int target=8;
        System.out.println(Arrays.toString(obj.searchRange(nums, target)));
    }

    
}