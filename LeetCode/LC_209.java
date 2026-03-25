

import java.util.Scanner;

public class LC_209 {

    public int MinSubArray(int arr[],int T){
        int sum =0;
        int minlength = Integer.MAX_VALUE;
        int n =arr.length;
        int i=0; 
        for(int j=0;j<n;j++){
            sum += arr[j];
            while(sum >= T){
                minlength = Math.min(minlength,j-i+1);
                sum -= arr[i];
                i++;
            }
        }
        return (minlength == Integer.MAX_VALUE)?0:minlength;
        
    }
    public static void main(String[] args) {
        LC_209 obj = new LC_209();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        System.out.println(obj.MinSubArray(arr, T));
    }
}