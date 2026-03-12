package ArrayCodes;

import java.util.Arrays;

public class AscendingAndDesending {
    void sort(){
        int arr[] = new int[]{2,10,3,6,3,9,21};
        int n= arr.length;
        int temp;
        for(int i=0;i<n/2;i++){
            for(int j=i+1;j<n/2;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for(int i=n/2;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        AscendingAndDesending obj=new AscendingAndDesending();
        obj.sort();
    }
}



// alternate method....................................................

// void sort(){
//         int arr[] = new int[]{2,10,3,6,3,9,21};
//         int n= arr.length;
//         int temp;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n/2;j++){
//                 if(arr[i]>arr[j]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }

//         }
//         int j=n-1;
//         for(int i=n/2;i<n;i++){
//             if(arr[i]<arr[j]){
//                 temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;

//             }
//         }
//     }


// first sort then reverse the next half.

        


