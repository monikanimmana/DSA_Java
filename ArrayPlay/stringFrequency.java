package DSA_Java.ArrayPlay;

import java.util.HashMap;

public class stringFrequency {
    public int Frequency(String s){
        HashMap<Character,Integer> map1 = new HashMap<>();
        int max_freq =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch , map1.getOrDefault(ch ,0)+1);
            max_freq = Math.max(max_freq , map1.get(ch));
        }
        System.out.println(map1);
        return max_freq;

    }
    public int NonRepeating(String s){
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map2.put(ch , map2.getOrDefault(ch,0)+1);
        }
        for(char ch : s.toCharArray()){
            if(map2.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        stringFrequency obj = new stringFrequency();
        String s= "abbcccad";
        obj.NonRepeating(s);
        System.out.println(obj.Frequency(s));
    }
}
