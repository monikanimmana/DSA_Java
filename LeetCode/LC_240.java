public class LC_240 {
    public boolean searchMatrix(int matrix[][], int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        while(row < n && col >=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LC_240 obj=new LC_240();
        int matrix[][]=new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=100;
        System.out.println(obj.searchMatrix(matrix, target));
    }
}
