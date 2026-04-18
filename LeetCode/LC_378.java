public class LC_378 {
    public int KthSmallest(int matrix[][] , int k){
        int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        while(low<=high){
            int mid=low+((high-low)/2);
            int element_count=topRightApproach(matrix, mid);
           if(element_count<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public int topRightApproach(int matrix[][] ,int mid){
        int row=0;
        int col=matrix.length-1;
        int element_count=0;
        while(row<matrix.length-1 && col>=0){
            if(matrix[row][col]<=mid){
                element_count+=(col+1);
                row++;
            }else{
                col--;
            }
        }
        return element_count;
    }
    public static void main(String[] args) {
        LC_378 obj=new LC_378();
        int matrix[][] = new int[][]{{2,6,8},{3,10,12},{4,13,14}};
        int k=4;
        System.out.println(obj.KthSmallest(matrix, k));
    }
    
}
