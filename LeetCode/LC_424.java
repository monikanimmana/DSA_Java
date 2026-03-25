

import java.util.HashMap;
import java.util.Map;

public class LC_424{

    public int CharacterReplacement(String s, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int max_freq=0;
        int left=0;
        int max_substr=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            max_freq = Math.max(max_freq, map.get(s.charAt(right)));

            while(((right-left+1) - max_freq)>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            max_substr = Math.max(max_substr, right-left+1);
        }
        
        return max_substr;
    }
    public static void main(String[] args) {
        LC_424 obj = new LC_424();
        String S = "BAAAB";
        int k = 2;
        System.out.println(obj.CharacterReplacement(S, k));
    }
}