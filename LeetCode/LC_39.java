import java.util.ArrayList;
import java.util.List;
public class LC_39 {
    public List<List<Integer>> sequence(int nums[] , int target){
        int indx=0;
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        checksubset(nums,target,list,indx,result);
        return result;
    }
    public void checksubset(int nums[], int target, List<Integer> list , int indx, List<List<Integer>> result){
        if(indx==nums.length){
            if(target==0){
                result.add(new ArrayList<>(list));
            }
            return ;
        }
        if(nums[indx]<target){
            list.add(nums[indx]);
            checksubset(nums, target-nums[indx], list, indx, result);
            list.remove(list.size()-1);
            target+=nums[indx];
        }
        checksubset(nums, target, list, indx+1, result);
    }
    public static void main(String[] args) {
        LC_39 obj=new LC_39();
        int nums[]=new int[]{2,3,6,7};
        int target=7;
        System.out.println(obj.sequence(nums, target));
    }
}
