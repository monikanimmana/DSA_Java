package ArrayCodes;
 

// BRUTEFORCE APPROACH ======================================================

// public class DisjointArray {
//     void disjoint(){
//        int arr1[] = new int[] {1,2,3};
//        int arr2[] = new int[] {4,9,6,1};
//        int n1 = arr1.length;
//        int n2 = arr2.length;
//        int value = 0;
//        for(int i=0;i<n1;i++){
//         for(int j=0;j<n2;j++){
//             if(arr1[i] == arr2[j]){
//                 value = 1;
//                 break;
//             }
//         }
//         if (value == 1){
//                 break;
//             }
//        }
//        if(value==0){
//          System.out.println("Arrays are disjoint");
//        }
//        else{
//         System.out.println("Arrays are not disjoint");
//        }
//     }
//     public static void main(String[] args) {
//         DisjointArray obj = new DisjointArray();
//         obj.disjoint();
//     }
// }