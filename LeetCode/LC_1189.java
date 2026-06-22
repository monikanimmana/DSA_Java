import java.util.HashMap;

public class LC_1189 {
    public int balloons(String str){
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i : str.toCharArray()){
            map.put(i , map.getOrDefault(i, 0)+1);
        }
        count = Math.min(Math.min(map.getOrDefault('b',0),map.getOrDefault('a', 0)),Math.min(Math.min(map.getOrDefault('l',0)/2,map.getOrDefault('o', 0)/2),map.getOrDefault('n',0)));
        return count;   
    }
    public static void main(String[] args) {
        LC_1189 obj=new LC_1189();
        String str="balloonnololab";
        System.out.println(obj.balloons(str));
    }
}
