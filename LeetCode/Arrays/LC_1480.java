package Arrays;
import java.util.*;

class LC_1480 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int value =0;
        for(int i =0;i< n;i++){
            value += nums[i];
            nums[i] = value;

        }
        return nums;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        LC_1480 obj =new LC_1480();
        String s = sc.nextLine();
        String[] r = s.split(" ");
        int nums [] = new int[r.length];
        for(int i=0;i<r.length;i++){
            nums[i] = Integer.parseInt(r[i]);
        }

        System.out.println(Arrays.toString(obj.runningSum(nums)));
        
    }
}