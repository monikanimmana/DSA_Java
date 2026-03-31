public class LC_35{
    public int searchPosition(int arr[] , int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        LC_35 obj=new LC_35();
        int arr[] = new int[]{1,3,5,6};
        int target=2;
        System.out.println(obj.searchPosition(arr, target));
    }
}