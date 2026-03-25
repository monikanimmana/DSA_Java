

public class LC_643{
    public void Maximum_SubArray(){
        int arr[] = new int[] {1,12,-5,-6,50,3};
        int k =4;
        float windowSum = 0;
        float max_sum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        max_sum = windowSum;
        int left=0;
        int right= k;
        while(right < arr.length){
            windowSum = windowSum - arr[left] + arr[right]  ;
            left++;
            right++;
            if( windowSum > max_sum){
                max_sum = windowSum;
            }
        }
        System.out.printf("%.5f",max_sum / k);

    }
    public static void main(String[] args) {
        LC_643 obj = new LC_643();
        obj.Maximum_SubArray();
    }
}