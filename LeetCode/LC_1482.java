public class LC_1482 {
    public int minDays(int nums[],int m , int k){
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        if((long)(m*k) > nums.length) return -1;
        for(int i:nums){
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean possible=bloomDays(nums,m,k,mid);
            if(possible){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean bloomDays(int nums[],int m,int k, int days){
        int count=0;
        int bouq=0;
        for(int i:nums){
            if(i<=days){
                count++;
            }else{
                bouq+=(count/k);
                count=0;
            }
        }
        bouq+=(count/k);

        return bouq>=m;
    }
    public static void main(String[] args) {
        LC_1482 obj=new LC_1482();
        int nums[]=new int[]{1,10,2,10,3};
        int m=3;
        int k=1;
        System.out.println(obj.minDays(nums, m, k));
        
    }
}
