package ArrayCodes;
import java.util.*;

public class RepeatedElements {
    void repeatedelements(){
        int arr[] = new int []{10, 30, 30, 20, 10, 20, 50, 10};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    i++;

                }else{
                    break;
                }
                
            }
            if(count>1){
                System.out.println(arr[i]);
            }
            

        }

    }
    public static void main(String[] args) {
        RepeatedElements obj=new RepeatedElements();
        obj.repeatedelements();
    }
    
}

/*
int visited_item =0;
        for(int i=0;i<arr.length;i++){
            if(i==0 && arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                visited_item = arr[i];

            }else if(i>0 && i<arr.length-1 && (arr[i] == arr[i-1] || arr[i] == arr[i+1]) && visited_item != arr[i]){
                System.out.println(arr[i]);
                visited_item = arr[i];
            }else if(i == arr.length-1 && arr[i] == arr[i-1] && visited_item != arr[i]){
                System.out.println(arr[i]);
            }
        }
*/
