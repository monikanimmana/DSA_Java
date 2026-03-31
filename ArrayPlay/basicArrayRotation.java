package DSA_Java.ArrayPlay;

import java.util.Arrays;

public class basicArrayRotation {
    public int[] arrayrotate(int arr[],int k){
        int n= arr.length;
        int new_arr[] = new int[n];
        for(int i=0;i<n;i--){
            new_arr[(i+k)%n] = arr[i];
        }
        return new_arr;
    }
    public static void main(String[] args) {
        basicArrayRotation obj=new basicArrayRotation();
        int arr[] = new int[]{1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(obj.arrayrotate(arr, k)));
    }
}
