package DSA_Java.ArrayPlay;

import java.util.Arrays;

public class remove_duplicate {
    public int[] duplicate(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
            
        }        
        return arr;
    }
    public static void main(String[] args) {
        remove_duplicate obj=new remove_duplicate();
        int arr[] = new int[]{1,1,2,2,3};
        System.out.println(Arrays.toString(obj.duplicate(arr)));
    }

}
