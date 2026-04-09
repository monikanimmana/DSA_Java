

import java.util.HashSet;
import java.util.Set;

public class LC_3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i=0;
        int max_length = 0 ;
        int n = s.length();
        for(int j=0;j<n;j++){
            while(!set.add(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            max_length = Math.max(max_length,j-i+1);
        }
        return max_length;
    }
    public static void main(String[] args) {
        LC_3 obj = new LC_3();
        String s = "stringname";
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
    
}
