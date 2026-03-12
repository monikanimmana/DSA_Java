package ArrayCodes;

import java.util.Arrays;

public class SortFrequencyArray {
    void frequency(){
        int arr[] = new int[]{1,1,2,3,1,7,5,2};
        int k=0;
        Arrays.sort(arr);
        int n = arr.length;
        int count;
        int arr1[][] = new int[n][n];
        for(int i=0;i<n;i++){
            count=1;
            while(i < n-1 && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            arr1[k][0] = arr[i];
            arr1[k][1] = count;
            k++;

        }
        Arrays.sort(arr1, 0, k ,(a,b) -> a[1]-b[1]);
        for(int i=0;i<k;i++){
            System.out.println(arr1[i][0] + "->" + arr1[i][1]);

        }
            

    }
        
    public static void main(String[] args) {
        SortFrequencyArray obj=new SortFrequencyArray();
        obj.frequency();
    }
    
}
