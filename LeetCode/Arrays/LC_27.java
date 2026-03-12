package Arrays;

import java.util.Arrays;

public class LC_27 {
    public void RemoveElements(){
        int [] arr = new int[]{1,1,2,3,3,4};
        int valu = 1;
        int k=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=valu){
                arr[k]=arr[i];
                k++;
            }
        }
        System.out.println(k + "," + Arrays.toString(Arrays.copyOf(arr, k)));
        
    }
    public static void main(String[] args) {
        LC_27 obj = new LC_27();
        obj.RemoveElements();
    }
}
