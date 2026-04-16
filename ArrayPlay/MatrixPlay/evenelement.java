public class evenelement{
    public int elementcount(int nums[][]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]%2==0){
                    count++;
                }
                
            }
        }
        return count;
    }
    public static void main(String[] args) {
       evenelement obj=new evenelement();
       int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
       System.out.println(obj.elementcount(nums));
    }
}