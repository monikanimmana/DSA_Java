public class matrixsum {
    public int sum(int nums[][]){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                sum += nums[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
       matrixsum obj=new matrixsum();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.sum(nums));
    }
}
