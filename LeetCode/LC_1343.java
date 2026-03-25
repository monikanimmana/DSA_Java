
import java.util.*;
public class LC_1343{
    public int numOfSubarrays(int arr[], int k , int threshold){
        int sum =0;
        int count =0;
        int len = arr.length;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int max_sum = k * threshold;
        if(sum >= max_sum){
                count++;
            }
        for(int right=k;right<len;right++){
            sum = sum - arr[right-k] + arr[right];
            if(sum >= max_sum){
                count++;
            }
        }
        return count;

    }
    public static void main(String args[]){
        LC_1343 obj = new LC_1343();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int threshold = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(obj.numOfSubarrays(arr,k,threshold));
    }
}