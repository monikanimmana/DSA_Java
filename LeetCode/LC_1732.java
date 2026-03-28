public class LC_1732 {
    public int largestAltitude(int nums[]){
        int sum=0;
        int max_num=0;
        for(int x:nums){
            sum+=x;
            max_num=Math.max(max_num,sum);
        }
        return max_num;
    }
    public static void main(String[] args) {
        LC_1732 obj=new LC_1732();
        int nums[] = new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(obj.largestAltitude(nums));
    }
}
