public class Countelement{
    static int find(int arr[] , int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                count++;
            }
        }
        return count;
    }
    static boolean palindrom(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean equals(int []arr1,int []arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    static int[] reverse(int []arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        return arr;
    }
}