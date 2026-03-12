package ArrayCodes;

import java.util.Arrays;

public class TwoPointerArray {
    void reverse(){
        int arr[] = new int[]{2,5,7,9,1,4};
        int j=arr.length-1;
        for(int i=0;i<arr.length-1;i++){
            if(i>=j){
                break;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        TwoPointerArray obj=new TwoPointerArray();
        obj.reverse();
    }
    
}
