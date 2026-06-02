public class BasicArray {
    // static void 2Darray(int [][] arr){

    // }
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4,5},{5,6,7,8,6},{9,10,11,12,8}};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.println(arr[i][j]);
        //     }
        // } 
        // for(int []row:arr){
        //     for(int val:row){
        //         System.out.println(val);

        //     }
        // }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
                
            }
            
        }
        
    }
