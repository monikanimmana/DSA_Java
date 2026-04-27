import java.util.Arrays;
public class insertion_sort {
    public int[] sortorder(int nums[]){
        int n=nums.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        insertion_sort obj=new insertion_sort();
        int nums[]=new int[]{2,67,34,1,23,9,10};
        System.out.println(Arrays.toString(obj.sortorder(nums)));
    }
    
}
