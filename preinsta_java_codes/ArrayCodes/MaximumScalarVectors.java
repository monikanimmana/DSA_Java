package ArrayCodes;
import java.util.*;

public class MaximumScalarVectors {
    void maximumscalarvectors(){
        int arr1[] =  new int[]{1, 2, 6, 3, 7};
        int arr2[] = new int[]{10, 7, 45, 3, 7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int maxvector = 0;
        for(int i=0;i<arr1.length;i++){
            maxvector += (arr1[i] * arr2[i]);
        }
        System.out.println(maxvector);

    }
    public static void main(String[] args) {
        MaximumScalarVectors obj = new MaximumScalarVectors();
        obj.maximumscalarvectors();
    }
}