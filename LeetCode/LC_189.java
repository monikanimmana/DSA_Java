import java.util.Arrays;

public class LC_189 {
    public int[] rotateArray(int nums[] , int k){
        int n=nums.length;
        int j=k-1;
        for(int i=n-1;i>=n-k;i--){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;

        }
        return nums;
    }
    public static void main(String[] args) {
        LC_189 obj=new LC_189();
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(obj.rotateArray(nums, k)));
    }
}
