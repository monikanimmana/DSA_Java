package DSA_Java.ArrayPlay;

import java.util.Arrays;


public class movezeros {
    public int[] movezerolast(int arr[]){
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        movezeros obj=new movezeros();
        int arr[] = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(obj.movezerolast(arr)));
    }
}
