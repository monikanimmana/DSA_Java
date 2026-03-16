package Arrays;

import java.util.Scanner;

public class LC_219{
    public Boolean Duplicatell(int arr[],int k){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int windowEnd = Math.min(i+k, n-1);
            for(int j=i+1;j<=windowEnd;j++){
                if(arr[i]==arr[j]){
                   return true;
                    
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {
        LC_219 obj = new LC_219();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Boolean res = obj.Duplicatell(arr,k);
        System.out.println(res);
    }
}