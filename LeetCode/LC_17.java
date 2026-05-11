import java.util.ArrayList;
import java.util.List;

public class LC_17 {

    public List<String> phone_number(String digits){
        List<String> result=new ArrayList<>();
        StringBuilder substring=new StringBuilder();
        if(digits.length()==0){
            return result;
        }
        int index=0;
        String[] combinations=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination_letters(digits , index , result,substring,combinations);
        return result;
    }
    public void combination_letters(String digits , int index , List<String> result , StringBuilder substring,String[] combinations){
        if(substring.length()==digits.length()){
            result.add(new String(substring));
            return;
        }

        String letters=combinations[digits.charAt(index)-'0'];

        for(char ch:letters.toCharArray()){
            substring.append(ch);
            combination_letters(digits, index+1, result, substring, combinations);
            substring.deleteCharAt(substring.length()-1);
        }

    }
    public static void main(String[] args) {
        LC_17 obj=new LC_17();
        String digits="23";
        System.out.println(obj.phone_number(digits));
    }
}