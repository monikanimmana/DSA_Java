public class LC_704{
    public int search(int[] nums, int target) {
        int left=0;
        int right=(nums.length)-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        LC_704 obj = new LC_704();
        int nums[] = new int[]{-1,0,3,5,9,12};
        int target=9;
        System.out.println(obj.search(nums, target));
    }
}