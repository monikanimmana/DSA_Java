package ArrayCodes;
import java.util.*;

public class NonRepeatedElements {
    void nonrepeatedelements(){
        int arr[] = new int[]{1, 1, 1, 2, 3};
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    if(temp!=arr[i]){
                        System.out.println(arr[i]);
                        break;
                    }else{
                        break;
                    }
                }else{
                    i=i+1;
                    temp=arr[i];
                }

            }
            if(i == arr.length-1){
                if(temp != arr[i]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
    public static void main(String[] args) {
        NonRepeatedElements obj=new NonRepeatedElements();
        obj.nonrepeatedelements();
    }
}


/*efficient way =====================
for(int i=0;i<arr.length;i++){
    if(i==0&& arr[i]!=arr[i+1])
        sout(arr[i])
    elseif(i>0 && i< arr.length-1 && arr[i]!=arr[i-1] && arr[i]!= arr[i+1])
        sout(arr[i])
    elseif(i == arr.length - 1 && arr[i]!= arr[i-1])
        sout(arr[i])
        
}
*/
