package Arrays;

import java.util.HashMap;

public class LC_904{

    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int max_subarray = 0;
        for(int right = 0; right < fruits.length; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
            while(map.size() > 2){
                map.put(fruits[left], map.get(fruits[left]) - 1);
                if(map.get(fruits[left]) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            max_subarray = Math.max(max_subarray, right - left + 1);
        }
        return max_subarray;
    }
    public static void main(String[] args) {
        LC_904 obj = new LC_904();
        int fruits[] = new int[]{1,2,1};
        System.out.println(obj.totalFruit(fruits));
    }
}