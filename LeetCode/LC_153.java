public class LC_153{
    public int minvalue(int nums[]){
        int left=0;
        int right=nums.length-1;
        int min_val=Integer.MAX_VALUE;
        while(left<=right){
            if(nums[left]<nums[right]){
                min_val=Math.min(min_val,nums[left]);
            }

            int mid=(left+right)/2;
            min_val=Math.min(min_val,nums[mid]);
            if(nums[mid]>nums[right]){
                left=mid+1;

            }else{
                right=mid-1;
            }
        }

        return min_val;
    }
    public static void main(String[] args) {
        LC_153 obj=new LC_153();
        int nums[] = new int[]{2, 2, 2, 3, 4, 2};
        System.out.println(obj.minvalue(nums));
    }
}

// while(left<=right){
//     int mid=left+right/2;
//     if(nums[mid]>nums[right]){
//         left=mid+1;
//     }else{
//         right=mid;
//     }
//     return nums[left];
// }