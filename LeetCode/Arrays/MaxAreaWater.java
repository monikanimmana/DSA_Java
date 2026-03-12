package Arrays;
import java.util.*;

public class MaxAreaWater {
    void maxarea(){
        int arr[] = new int[]{1,8,6,2,5,4,8,3,7};
        int len = arr.length;
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        int k=0,l=0;
        for(int i=0;i<len;i++){
            if(arr[i] > largest){
                sec_largest = largest;
                largest = arr[i]; 
                k = i;
                   
            }
            else if(arr[i] > sec_largest && arr[i] == largest){
                sec_largest = arr[i];
                l = i;
                
                
            }

        }
        int diff = (-1)*(k-l);System.out.println(diff);
        int result = sec_largest * diff;

        System.out.println(result);

    }
    public static void main(String[] args) {
        MaxAreaWater obj=new MaxAreaWater();
        obj.maxarea();
    }
    
}
