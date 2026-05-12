
public class LC_37 {
    public void sudoko_solver(String [][] board){
        System.out.println(solver(board));
        
    }
    public boolean solver(String[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j].equals(".")){
                    for(int k=1;k<=9;k++){
                        if(isvalid(board ,i ,j,k)){
                            board[i][j]=String.valueOf(k);
                            if(solver(board)==true){
                                return true;
                            }
                            board[i][j]=".";
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isvalid(String[][] board ,int row , int col , int k){
        for(int c=0;c<9;c++){
            if(board[row][c].equals(String.valueOf(k))){
                return false;
            }

            if(board[c][col].equals(String.valueOf(k))){
                return false;
            }

            if(board[3*(row/3)+(c/3)][3*(col/3)+(c%3)].equals(String.valueOf(k))){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        LC_37 obj=new LC_37();
        String[][] board = new String[][]{{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        obj.sudoko_solver(board);
    }
}

