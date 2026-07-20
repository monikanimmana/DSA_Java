import java.util.Arrays;
public class LC_73{

                                    //Brute-force approach
    // public int[][] SetMatrixZero(int [][]matrix){
    //     boolean rows[]=new boolean[matrix.length];
    //     boolean col[]=new boolean[matrix[0].length];
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==0){
    //                 rows[i]=true;
    //                 col[j]=true;
    //             }
    //         }
    //     }

    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(rows[i]){
    //                 matrix[i][j]=0;
    //             }
    //             if(col[j]){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    //     return matrix;

    // }

    public int[][] SetMatrixZero(int[][]matrix){
        boolean firstcol=false;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0){
                firstcol=true;
            }
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            } 
        }
        
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[0].length-1;j>=0;j--){
                if(matrix[i][0] ==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                } 
            } 
            if(firstcol){
            matrix[i][0]=0;
            }
        }
        return matrix;  

    }
    public static void main(String[] args) {
        LC_73 obj=new LC_73();
        int matrix[][] = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        matrix = obj.SetMatrixZero(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            } 
        }       
    }
}