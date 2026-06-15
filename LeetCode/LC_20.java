public class LC_20{
    public boolean parenthese(String S){
        int top=-1;
        int n=S.length();
        char stack[]=new char[n];
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                top++;
                stack[top]=ch;
            }else{
                if(top==-1) return false;

                if(ch=='}'  && stack[top]!='{' || ch==']'  && stack[top]!='[' || ch==')'  && stack[top]!='(') return false;
                
                top--;
                
            }    
        }
        return top==-1;

    }
    public static void main(String[] args) {
        String S="}";
        LC_20 obj=new LC_20();
        System.out.println(obj.parenthese(S));
    }
}