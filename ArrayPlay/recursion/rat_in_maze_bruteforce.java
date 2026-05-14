
public class rat_in_maze_bruteforce {
    public void ratmaze(int [][]maze){
        int n=maze.length;
        int visited[][]=new int[n][n];
        visited[0][0]=1;
        String ans="";
        if(maze[0][0]==1) backtrack(maze,ans, 0, 0, visited, n);
        System.out.println(ans);
    }
    public void  backtrack(int[][] maze, String ans, int i, int j , int[][] visited,int n){
        if(i==n-1 && j==n-1){
           System.out.println(ans);
           return;
        }
        //DOWN-DIRECTIONS
        if(i+1<n && j<n && visited[i+1][j]==0 && maze[i+1][j]==1){
            visited[i+1][j]=1;
            backtrack(maze,ans+"D", i+1, j, visited, n);
            visited[i+1][j]=0;
        }

        //LEFT-DIRECTION
        if(i<n && j-1>=0 && visited[i][j-1]==0 && maze[i][j-1]==1){
            visited[i][j-1]=1;
            backtrack(maze,ans+"L", i, j-1, visited, n);
            visited[i][j-1]=0;
        }
        

        //RIGHT-DIRECTION
        if(i<n && j+1<n && visited[i][j+1]==0 && maze[i][j+1]==1){
            visited[i][j+1]=1;
            backtrack(maze,ans+"R", i, j+1, visited, n);
            visited[i][j+1]=0;
        }
        

        //UP-DIRECTION
        if(i-1>=0 && j<n && visited[i-1][j]==0 && maze[i-1][j]==1){
            visited[i-1][j]=1;
            backtrack(maze,ans+"U", i-1, j, visited, n);
            visited[i-1][j]=0;
        }
    }
    public static void main(String[] args) {
        rat_in_maze obj=new rat_in_maze();
        int [][]maze=new int[][]{{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        obj.ratmaze(maze); 
    }
}
