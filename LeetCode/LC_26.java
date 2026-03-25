
import java.util.Arrays;

public class LC_26{
    public void RemoveDuplicate(){
        int [] arr = new int[]{1,1,2,3,3,4};
        int i;
        int k=0;
        int n = arr.length;
        for(i=0;i<=n-2;i++){
            if(arr[i]!=arr[i+1]){
                arr[k]=arr[i];
                k++;
            }
        }
        arr[k]=arr[n-1];
        System.out.println(k + "," + Arrays.toString(Arrays.copyOf(arr, k+1)));
        
    }
    public static void main(String[] args) {
        LC_26 obj = new LC_26();
        obj.RemoveDuplicate();
    }
}