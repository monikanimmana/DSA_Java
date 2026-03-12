package ArrayCodes;

import java.util.*;

public class CountDistrintElements {
    void countdistrintelement(){
        int arr[] = new int[] {10, 30, 40, 20, 10, 20, 50, 10};
        int count =1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=arr[i+1]){
                    count++;
                }
            }
        System.out.println(count);
    }
    public static void main(String[] args) {
        CountDistrintElements obj=new CountDistrintElements();
        obj.countdistrintelement();
    }
    
}
