import java.util.Arrays;

public class matrix_colume_sort {
    public void matrixsort(int mat[][]){
        int arr[]=new int[mat.length];
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                arr[j]=mat[j][i];
            }
            Arrays.sort(arr);
            for(int j=0;j<mat.length;j++){
                mat[j][i]=arr[j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        matrix_colume_sort obj= new matrix_colume_sort();
        int [][]mat = new int[][]{ {1, 6, 10}, {8, 5, 9}, {9, 4, 15}, {7, 3, 60} };
        obj.matrixsort(mat);

    }
}
