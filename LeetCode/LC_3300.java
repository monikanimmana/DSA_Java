class LC_3300{
    public int sum(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n=n/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int val=sum(nums[i]);
            mini=Math.min(mini,val);
        }
        return mini;
    }
    public static void main(String[] args) {
        LC_3300 obj=new LC_3300();
        int nums[]=new int[]{10,12,13,14,15};
        System.out.println(obj.minElement(nums));
    }
}