package Arrays;

public class LC_14 {
    void longestcommonprefix(){
        String str[] = new String[] {"flower","flow","fly"};
        String prefix="";
        for(int i=0;i<str.length-1;i++){
            String str1 = str[i];
            String str2 = str[i+1];
            int n1 = str1.length();
            int n2 = str2.length();
            int n = (n1<n2)?n1:n2;
            int j=0;
            while(j<n){
                if(str1.charAt(j) == str2.charAt(j)){
                    char ch = str1.charAt(j);
                    prefix = prefix + ch;
                }
                else{
                    break;
                }
                j++;
            }

        }
        System.out.println(prefix);

    }
    public static void main(String[] args) {
        LC_14 obj=new LC_14();
        obj.longestcommonprefix();
    }
    
}
