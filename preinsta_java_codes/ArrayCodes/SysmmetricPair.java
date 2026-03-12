package ArrayCodes;
import java.util.*;

public class SysmmetricPair {
    void sysmmetricpair(){
        int arr[][] = new int [][]{{10,20},{30,60},{20,10},{30,30}};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i][0] == arr[i][1]){
                System.out.println(Arrays.toString(arr[i]));
            }
            for(int j=i+1; j<n;j++){
               if(arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]){
                    System.out.println(Arrays.toString(arr[i]));  
                }

            }
        }
    }
    public static void main(String[] args) {
        SysmmetricPair obj = new SysmmetricPair();
        obj.sysmmetricpair();
    }
    
}
