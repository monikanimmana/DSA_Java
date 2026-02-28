package LeetCode.LeetCodes.Arrays;

import java.util.*;

public class LC_989 {
    public static void main(String[] args) {
        int num[] = new int[]{1,2,0,0};
        int k = 23;
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = k;
        for(int i=n-1;i>=0;i--){
            int currentDigit = num[i];
            int sum = currentDigit + carry;
            int resultDigit = sum % 10;
            carry = sum / 10;
            result.add(resultDigit);
        }
        while(carry!=0){
            result.add(carry%10);
            carry /= 10;
        }

        Collections.reverse(result);
        System.out.println(result);


    }

    
}
