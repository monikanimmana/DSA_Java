
public class maxelement {
   public int maxvalue(int nums[][]){
        int max_val=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                max_val=Math.max(max_val, nums[i][j]);
            }
        }
        return max_val;
    }
    public static void main(String[] args) {
       maxelement obj=new maxelement();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.maxvalue(nums));
    } 
    
}
