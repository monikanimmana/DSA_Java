

import java.util.Arrays;
import java.util.Scanner;

public class LC_1 {
    public int[] sumtwo(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int target = sc.nextInt();
            LC_1 obj=new LC_1();
            System.out.print(Arrays.toString(obj.sumtwo(nums, target)));

        }
        
    }
}
