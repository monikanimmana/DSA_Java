import java.util.Arrays;
public class reverse_array {
    public int[] array(int i,int n , int arr[]){
        if(i>n/2){
            return arr;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        return array(i+1 ,n, arr);
    }
    public static void main(String[] args) {
        reverse_array obj=new reverse_array();
        int arr[]=new int[]{1,2,3,4,5};
        System.out.print(Arrays.toString(obj.array(0, arr.length, arr)));

    }
}
