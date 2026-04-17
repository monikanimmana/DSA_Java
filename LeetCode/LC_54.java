import java.util.Arrays;
public class LC_54 {
    public int[] spiralMatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;
        int result[]=new int[n*m];
        int k=0;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result[k]=matrix[top][i];
                k++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[k]=matrix[i][right];
                k++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[k]=matrix[bottom][i];
                    k++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[k]=matrix[i][left];
                    k++;
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        LC_54 obj=new LC_54();
        int matrix[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(obj.spiralMatrix(matrix)));
    }
}
