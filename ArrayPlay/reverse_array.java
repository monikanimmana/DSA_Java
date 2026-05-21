import java.util.Arrays;
public class reverse_array {
    // public int[] array(int i,int n , int arr[]){
    //     if(i>n/2){
    //         return arr;
    //     }
    //     int temp=arr[i];
    //     arr[i]=arr[n-i-1];
    //     arr[n-i-1]=temp;
    //     return array(i+1 ,n, arr);
    // }
    public int[] reverse(int arr[]){
        int rev[] = new int[arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[(n-1)-i];
        }
        return rev;
    }
    public static void main(String[] args) {
        reverse_array obj=new reverse_array();
        int arr[]=new int[]{1,2,3,4,5};
        System.out.print(Arrays.toString(obj.reverse( arr)));

    }
}
