
package ArrayCodes;
import java.util.*;

public class RemoveDuplicateElements {
    void removeduplicate(){
        int arr[] = new int[]{10, 20, 20, 30, 40, 40, 40, 50, 50};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[arr.length]);
    }
    public static void main(String[] args) {
        RemoveDuplicateElements obj=new RemoveDuplicateElements();
        obj.removeduplicate();
    }
    
}
