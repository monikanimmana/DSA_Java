package Arrays;

import java.util.Scanner;

public class LC_713{
    public int numSubarrayProductLessThanK(int arr[] , int k){
        int product = 1;
        int left=0;
        int count = 0;
        if(k<=1){
            return 0;
        }
        for(int right=0;right<arr.length;right++){
            product *= arr[right];
            while(product >= k){
                product /= arr[left];
                left++;
            }
            count += right-left+1;    
        }
        return count;    
    }
    public static void main(String[] args) {
        LC_713 obj = new LC_713();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k =sc.nextInt();
        System.out.println(obj.numSubarrayProductLessThanK(arr,k));
    }
}