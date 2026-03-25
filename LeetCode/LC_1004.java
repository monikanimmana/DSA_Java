

import java.util.Scanner;

public class LC_1004 {
    public int longestOnes(int arr[],int k){
        int left=0;
        int zero_count = 0;
        int max_size =0;
        for(int right=0;right<arr.length;right++){
            if(arr[right] == 0){
                zero_count++;
            }
            while(zero_count>k){
                if(arr[left]==0){
                    zero_count--;
                }
                left++;
            }
            max_size = Math.max(max_size , right - left + 1);

        }
        return max_size;
        
    }
     public static void main(String[] args) {
        LC_1004 obj = new LC_1004();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int  k = 2;
        System.out.println(obj.longestOnes(arr,k));
    }
    
}
