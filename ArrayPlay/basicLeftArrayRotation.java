package DSA_Java.ArrayPlay;

import java.util.Arrays;

public class basicLeftArrayRotation {
    public int[] arrayrotate(int arr[],int k){
        int n= arr.length;
        int new_arr[] = new int[n];
        for(int i=0;i<n;i++){
            new_arr[(i-k+n)%n] = arr[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        basicLeftArrayRotation obj=new basicLeftArrayRotation();
        int arr[] = new int[]{1,2,3,4,5};
        int k=2;
        System.out.println(Arrays.toString(obj.arrayrotate(arr, k)));
    }
}
