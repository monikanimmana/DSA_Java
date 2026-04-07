public class LC_162 {
    public int findPeak(int nums[]){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        
        return left;
    }
    public static void main(String[] args) {
        LC_162 obj=new LC_162();
        int nums[]= new int[]{1,2,3,4,5};
        System.out.println(obj.findPeak(nums));
    }
}
