
public class prefixSum {
     public int prefixsum(int arr[],int n){
        int prefix[] = new int[n];
        int sum=0;
        int l=2,R=3;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            prefix[i] = sum;
        }
        if(l==0){
            System.out.println(prefix[R]);
        }else{
            System.out.println(prefix[R]-prefix[l-1]);
        }
        return 0;
     }
     public int reversePrefix(int arr[],int n , int sum){
        int result=0;
        int count=0;
        for(int i=0;i<n;i++){
            result=0;
            for(int j=i;j<n;j++){
                result += arr[j];
                if(result == sum){
                    count++;;
                }

            }
        }
        System.out.println(count);
        return 0;

     }

     public static void main(String[] args) {
        prefixSum obj = new prefixSum();
        int arr[] = new int[]{1,2,3,-2,5};
        int n = arr.length;
        int sum = 3;
        obj.prefixsum(arr,n);
        obj.reversePrefix(arr, n, sum);
     }
}
