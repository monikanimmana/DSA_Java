public class LC_1011 {
    public int shipwithDays(int nums[],int days){
        int low=0;
        int high=0;
        for(int i:nums){
            low=Math.max(low, i);
            high +=i;
        }
        if(days > nums.length) return -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int min_days=weightcount(nums, mid, days);
            if(min_days<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public int weightcount(int nums[],int mid , int days){
        int sum=0;
        int min_days=1;
        for(int i:nums){
            if(sum+i<=mid){
                sum+=i;
            }else{
                min_days+=1;
                sum=i;
                if(min_days>days){
                    return min_days;
                }
            }
        }
        return min_days;
    }
    public static void main(String[] args) {
        LC_1011 obj=new LC_1011();
        int nums[]=new int[]{1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(obj.shipwithDays(nums, days));
    }
}
