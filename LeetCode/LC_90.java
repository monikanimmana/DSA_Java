import java.util.ArrayList;
import java.util.List;
public class LC_90 {
    public List<List<Integer>> subsetWithDup(int []nums){
        int index=0;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        checksubset(nums , index , list, result);
        return result;
    }
    public void checksubset(int []nums , int index , List<Integer> list , List<List<Integer>> result ){
        if(index==nums.length){
            if(!result.contains(list)){
                result.add(new ArrayList<>(list));
            }
            return;
        }
        list.add(nums[index]);
        checksubset(nums, index+1, list, result);
        list.remove(list.size()-1);
        checksubset(nums, index+1, list, result);
    }
    public static void main(String[] args) {
        LC_90 obj=new LC_90();
        int nums[]=new int[]{1,2,2};
        System.out.println(obj.subsetWithDup(nums));
    }
}
