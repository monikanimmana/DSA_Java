package ArrayCodes;
import java.util.*;

public class MinimumScalarVectors {
    void minimumscalarvectors(){
        int arr1[] = new int []{10, 30, 40, 20};
        int arr2[] = new int []{2, 4, 5, 1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int min_vector = 0;
        int len = arr1.length;
        for(int i=0;i<len;i++){
            int temp = arr1[i];
            arr1[i] = arr1[len - 1 - i];
            arr1[len - 1 - i] = temp;
        }
        for(int k=0;k<len;k++){
            min_vector += (arr1[k] * arr2[k]);
        }
        System.out.println(min_vector);    
    }
    public static void main(String[] args) {
        MinimumScalarVectors obj=new MinimumScalarVectors();
        obj.minimumscalarvectors();
    }
    
}
