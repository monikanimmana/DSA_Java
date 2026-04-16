public class diagonalelements {
    public void normaldiagonal(int nums[][]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i][i] + " ");      
        }
        System.out.println();
    } 
    public void antidiagonal(int nums[][]){
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i][n-i-1] + " ");      
        }
    } 

    public static void main(String[] args) {
        diagonalelements obj=new diagonalelements();
        int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        obj.normaldiagonal(nums);
        obj.antidiagonal(nums);
    } 
}
