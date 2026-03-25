
import java.util.Arrays;
import java.util.Scanner;

public class LC_2{
    public void mediantwosortedarray(){
        int []nums1 = new int[]{1,2};
        int []nums2 = new int[]{3,4};
        int n1=nums1.length;
        int n2=nums2.length;
        int len = n1+n2;
        int merge[] = new int[len];
        double median;
        for(int i=0;i<len;i++){
           if(i < n1){
            merge[i] = nums1[i];

           }else{
            merge[i] = nums2[i- n1];
           }
        }
        Arrays.sort(merge);

        if(len%2==0){
            median = (merge[len/2 - 1] + merge[len/2]) / 2.0;
                }
        else{
            median = (merge[len/2]);
        }

        System.out.println(median);
        
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            LC_2 obj=new LC_2();
            obj.mediantwosortedarray();
        }
        
    }
}
