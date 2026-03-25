
import java.util.*;

public class LC_66 {
     public void OnePlus(){
        int arr[] = new int []{9,9};
        int len = arr.length;
        for(int i=len-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                return;
            }
            arr[i]=0;
        }
        int res[] = new int[len+1];
        res[0]=1;
        System.out.println(Arrays.toString(res));

     }
     public static void main(String[] args) {
        LC_66 obj = new LC_66();
        obj.OnePlus();
     }

    }
