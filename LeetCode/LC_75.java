import java.util.Arrays;

public class LC_75{
    public int[] sortColour(int arr[]){
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }else{
                mid++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        LC_75 obj=new LC_75();
        int arr[] = new int[]{2,0,1};
        System.out.println(Arrays.toString(obj.sortColour(arr)));
    }
}



// int zeros =0;
//         int ones=0;
//         int twos=0;
//         for(int x : arr){
//             if(x==0){
//                zeros+=1;
//             }else if(x==1){
//                 ones+=1;
//             }else{
//                 twos+=1;
//             }
//         }
//         int i=0;
//         while(i<arr.length){
//             if(zeros>0){
//                 arr[i]=0;
//                 zeros--;
//             }else if(ones>0){
//                 arr[i]=1;
//                 ones--;
//             }else{
//                 arr[i]=2;
//                 twos--;
//             }
//             i++;
//         }
