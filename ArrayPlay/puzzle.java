import java.util.ArrayList;
import java.util.List;

public class puzzle {
    static void sumindex(int []arr){
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int result=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            result = sum - arr[i];
            list.add(result);
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        sumindex(arr);
    }
}
