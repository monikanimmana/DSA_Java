package Arrays;
import java.util.*;

public class LC_283 {
    public void MoveZeros(){
        int arr[] = new int[]{1, 0, 2, 0, 0, 4};
        int n = arr.length;
        int i=0;
        for(int k=0;k<n;k++){
            if(arr[k]!=0){
                arr[i]=arr[k];
                i++;
            }
        }
        while(i<n){
                arr[i]=0;
                i++;
            }

        System.out.println(Arrays.toString(Arrays.copyOf(arr,i)));
    }
    public static void main(String[] args) {
        LC_283 obj = new LC_283();
        obj.MoveZeros();
    }
}
