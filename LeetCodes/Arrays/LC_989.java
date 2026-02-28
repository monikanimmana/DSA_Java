package LeetCode.LeetCodes.Arrays;

import java.util.*;

public class LC_989 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list1 = new ArrayList<>();
        int k = 914;
        int n = list.size();
        for(int i=n-1;i>=0;i--){
            int num = list.get(i);
            int sum = num + k;
            int val = sum % 10;
            k = sum / 10;
            list1.add(val);
        }
        while(k!=0){
            int val = k % 10;
            list1.add(val);
            k /= 10;

        }
        Collections.reverse(list1);
        System.out.println(list1);

    }

    
}
