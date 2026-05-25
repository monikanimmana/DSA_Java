public class GP{
    static void find(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            int left=i-1;
            int right=i+1;
            while(left>=0 && right<arr.length){
                int productsq=arr[i]*arr[i];
                int product=arr[left]*arr[right];
                if(product==productsq){
                    System.out.println(arr[left] + " " + arr[i] + " " + arr[right]);
                    left--;
                    right++;
                }else if(productsq<product){
                    left--;
                }else{
                    right++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,6,18,54};
        find(arr);
    }
}


// static void triplets(int arr[] , int n){
//     for(int j=1;j<=n-1;j++){
//         for(int i=0;i<j;i++){
//             if(arr[j]%arr[i]==0){
//                 int r=arr[j]/arr[i];
//                 int third=r*arr[j];
//                 for(int k=j+1;k<n;k++){
//                     if(arr[k]==third){
//                         System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
//                     }
//                 }
//             }
//         }
//     }
// }