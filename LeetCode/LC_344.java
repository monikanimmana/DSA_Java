import java.util.Arrays;

public class LC_344 {
    public void reverseString( int l ,int n,char[] s){
        if(l>=n/2){
            return;
        }
        char temp=s[l];
        s[l]=s[n-l-1];
        s[n-l-1]=temp;

        reverseString(l+1, n , s);
    }

    // while(l<r){
    //     char temp=s[l];
    //     s[l]=s[r];
    //     s[r]=temp;
    // }
    public static void main(String[] args) {
        LC_344 obj=new LC_344();
        char s[]=new char[]{'h','e','l','l','o'};
        int n=s.length;
        obj.reverseString(0,n,s);
        System.out.println(Arrays.toString(s));
    }
}
