import java.util.ArrayList;
import java.util.List;
public class palindrom_string {
    public List<List<String>> string_generator(String str){
        List<List<String>> result=new ArrayList<>();
        List<String> list=new ArrayList<>();
        int index=0;
        backtrack(str , list , result , index); 
        return result;
    }
    public void backtrack(String str, List<String> list , List<List<String>> result , int index){
        if(index == str.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index ; i<str.length();i++){
            if(palindrom(i , index,str)){
                String part=str.substring(index , i+1);
                list.add(part);
                backtrack(str, list, result, i+1);
                list.remove(list.size()-1);
            }
            else{
                continue;
            }
        }
    }
    public boolean palindrom(int i, int index,String str){
        int first=index;
        int last=i;
        while(first<=last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrom_string obj=new palindrom_string();
        String str="aba";
        System.out.println(obj.string_generator(str));
    }
}
