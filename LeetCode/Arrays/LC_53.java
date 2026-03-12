package Arrays;

public class LC_53 {
    public void Maximum_SubArray(){
        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum = 0;
        int max_profit = Integer.MIN_VALUE;
        //Optimal Solution ------------------------------------------------------------------------
        for (int i : arr){
            sum += i;
            if( sum > max_profit){
                max_profit = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        System.out.println(max_profit);
    }
    public static void main(String[] args) {
        LC_53 obj = new LC_53();
        obj.Maximum_SubArray();
    }
    
}


// Bruteforce Method -------------------------------------------------------

// for(int i =0;i<n;i++){
//     int sum =0;
//     for(int j=i;j<n;j++){
//         sum += arr[j];
//         for(int k=i;k<j;k++){
//             if(sum > max_profit){
//                 max_profit = sum;

//             }
//         }
//     }
// }
