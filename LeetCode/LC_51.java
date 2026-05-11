import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_51 {
    public List<List<String>> solveNQueens(int n) {
      List<List<String>> result=new ArrayList<>();
      char[][] board=new char[n][n];

      boolean[] rows=new boolean[n];
      boolean[] lowerdiagonal=new boolean[2*n-1];
      boolean[] upperdiagonal=new boolean[2*n-1];
      for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

      CheckQueens(0,board,rows,lowerdiagonal,upperdiagonal,result);

      return result;
    }
    public void CheckQueens(int col,char[][] board,boolean[] rows,boolean[] lowerdiagonal,boolean[] upperdiagonal,List<List<String>> result){

        if(col==board.length){
        result.add(construct(board));
            return;
        }

        for( int row=0;row<board.length;row++){

        if(!rows[row] && !lowerdiagonal[col+row] && !upperdiagonal[(board.length-1)+col-row]){

            board[row][col]='Q';
            rows[row]=true;
            lowerdiagonal[col+row]=true;
            upperdiagonal[(board.length-1)+col-row]=true;

            CheckQueens(col+1,board,rows,lowerdiagonal,upperdiagonal,result);
            board[row][col]='.';
             rows[row]=false;
            lowerdiagonal[col+row]=false;
            upperdiagonal[(board.length-1)+col-row]=false;
        }

        }
    }
    private List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }
    public static void main(String[] args) {
        LC_51 obj=new LC_51();
        int n=5;
        System.out.println(obj.solveNQueens(n));
    }
}

