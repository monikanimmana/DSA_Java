import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_18 {
    public List<List<Integer>> fourSum(int nums[], int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    j++;
                    continue;
                }

                int left=j+1;
                int right=nums.length-1;
                while(left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }else if(sum>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return result;

    }
    public static void main(String[] args) {
        LC_18 obj=new LC_18();
        int nums[] = new int[]{1,0,-1,0,-2,2};
        int target=0;
        System.out.println(obj.fourSum(nums, target=0));
    }
}
