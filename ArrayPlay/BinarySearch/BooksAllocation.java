public class BooksAllocation {
    public int maxBooks(int arr[], int k){
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i:arr){
            low=Math.max(low,i);
            high+=i;
        }
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canplace(arr, mid, k)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public boolean canplace(int arr[], int mid , int k){
        int page=arr[0];
        int stu_count=1;
        for(int i=1;i<arr.length;i++){
            if(page+arr[i]<=mid){
                page+=arr[i]; 
            }else{
                stu_count++;
                page=arr[i];
            }
            if(stu_count>k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        BooksAllocation obj = new BooksAllocation();
        int arr[] = new int[]{12, 34, 67, 90};
        int k=2;
        System.out.println(obj.maxBooks(arr,k));
    }
}
