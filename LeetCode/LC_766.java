public class LC_766{
    public boolean isToeplitzMatrix(int[][] matrix){
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int matrix[][]=new int [][]{{1,2,3,5},{4,5,6,7},{1,2,3,4}};
        LC_766 obj=new LC_766();
        System.out.println(obj.isToeplitzMatrix(matrix));
    }
}