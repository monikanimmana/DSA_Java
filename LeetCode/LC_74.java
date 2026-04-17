public class LC_74{
    public void searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0] <= target && target<=matrix[i][m-1]){
                System.out.println(findtarget(matrix[i] , target));
            }
        }
    }
    public boolean findtarget(int matrix[] , int taregt){
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(matrix[mid]==taregt){
                return true;
            }else if(matrix[mid]>taregt){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    } 
    public static void main(String[] args) {
        LC_74 obj=new LC_74();
        int nums[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        obj.searchMatrix(nums, target);
    }
}

//optimal solution
// int low=0;int high=m*n-1;
// int r=nums.length;
// int c=nums[0].length;
// while(low<=high){
//     int mid=low+high/2;
//     int row=mid/c;
//     int col=mid%c;
//     if(nums[row][col]==target){
//         return true;
//     }else if(nums[row][col]>target){
//         high=mid-1;
//     }else{
//         low=mid+1;
//     }
// }
// return false;

